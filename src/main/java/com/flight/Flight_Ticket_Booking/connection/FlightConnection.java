package com.flight.Flight_Ticket_Booking.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class FlightConnection {

	public static Connection getFlightConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/flight-booking";
			String user = "root";
			String pass = "root";
			return DriverManager.getConnection(url,user,pass);
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
