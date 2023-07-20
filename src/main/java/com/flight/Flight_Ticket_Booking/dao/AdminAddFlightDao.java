package com.flight.Flight_Ticket_Booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Source;

import com.flight.Flight_Ticket_Booking.connection.FlightConnection;
import com.flight.Flight_Ticket_Booking.controller.AdminAddFlightsController;
import com.flight.Flight_Ticket_Booking.dto.AdminAddFlight;
import com.mysql.cj.xdevapi.Result;

public class AdminAddFlightDao {

	Connection connection = FlightConnection.getFlightConnection();

	/*
	 * 
	 * addFlight
	 */
	public AdminAddFlight adminAddFlight(AdminAddFlight addFlight) {
		String addFlightQuery = "insert into flightdetails values(?,?,?,?,?,?,?,?)";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(addFlightQuery);

			preparedStatement.setInt(1, addFlight.getFlightNumber());
			preparedStatement.setString(2, addFlight.getFlightName());
			preparedStatement.setString(3, addFlight.getFlightDestination());
			preparedStatement.setString(4, addFlight.getFlightSource());
			preparedStatement.setTime(5, addFlight.getDepatureTime());
			preparedStatement.setTime(6, addFlight.getArrivalTime());
			preparedStatement.setDouble(7, addFlight.getFlightEconomyPrice());
			preparedStatement.setDouble(8, addFlight.getBusinessPrice());

			preparedStatement.execute();
			
			return addFlight;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	/*
	 * getAllFlight
	 */
	public List<AdminAddFlight> getAllFlights() {
		String displayAllFlight = "select * from flightdetails";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayAllFlight);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<AdminAddFlight> addFlights = new ArrayList<>();
			while (resultSet.next()) {
				
				AdminAddFlight addFlight = new AdminAddFlight();
				addFlight.setFlightNumber(resultSet.getInt("number"));
				addFlight.setFlightName(resultSet.getString("flightname"));
				addFlight.setFlightSource(resultSet.getString("source"));
				addFlight.setFlightDestination(resultSet.getString("destination"));
				addFlight.setDepatureTime(resultSet.getTime("depature"));
				addFlight.setArrivalTime(resultSet.getTime("arrival"));
				addFlight.setFlightEconomyPrice(resultSet.getDouble("economyprice"));
				addFlight.setBusinessPrice(resultSet.getDouble("businessprice"));

				addFlights.add(addFlight);

			}
			return addFlights;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * delete flight
	 * 
	 */
	public int deleteFlight(int flightNumber) {
		String deleteQuery =  "DELETE from flightdetails where number=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, flightNumber);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 * getFlightBySourceToDestination
	 */
	public List<AdminAddFlight> geFlightBySourcToDestination(String source, String destination){
		
		List<AdminAddFlight> addFlights = getAllFlights();
		
		List<AdminAddFlight> filterFlightDetails = new ArrayList<AdminAddFlight>();
		
		for (AdminAddFlight adminAddFlight : addFlights) {
			if ((adminAddFlight.getFlightSource().equalsIgnoreCase(source)) 
				&& (adminAddFlight.getFlightDestination().equalsIgnoreCase(destination))){
					
					filterFlightDetails.add(adminAddFlight);
				}
			}
			
			return filterFlightDetails;
		}
	}
	

