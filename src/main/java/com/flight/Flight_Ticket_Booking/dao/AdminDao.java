package com.flight.Flight_Ticket_Booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flight.Flight_Ticket_Booking.connection.FlightConnection;
import com.flight.Flight_Ticket_Booking.dto.Admin;

public class AdminDao {

	Connection connection = FlightConnection.getFlightConnection();
	
	public List<Admin> getAllAdmins(){
		
		String displayAdminQuery = "SELECT * FROM adminlogin";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayAdminQuery);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			List<Admin> admins = new ArrayList<Admin>();
			
			while(resultSet.next()) {
				
				Admin admin = new Admin();
				
				admin.setId(resultSet.getInt("id"));
				admin.setEmail(resultSet.getString("email"));
				admin.setPassword(resultSet.getString("password"));
				
				admins.add(admin);
			}
			return admins;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * getDataByEmail
	 */
	public Admin getAdminByEmail(String adminEmail) {
		
		List<Admin> admins = getAllAdmins();
		
		for (Admin admin : admins) {
			
			if(admin.getEmail().equals(adminEmail)) {
				return admin;
			}
		}
		return null;
	}
}
