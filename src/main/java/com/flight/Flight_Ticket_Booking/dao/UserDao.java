package com.flight.Flight_Ticket_Booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flight.Flight_Ticket_Booking.connection.FlightConnection;
import com.flight.Flight_Ticket_Booking.dto.User;

public class UserDao {

	Connection connection = FlightConnection.getFlightConnection();

	/*
	 * save User details
	 */
	public User saveUser(User user) {

		String insertUserQuery = "insert into user(name,email,password) values(?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertUserQuery);

			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());

			preparedStatement.execute();
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * get all user
	 */
	public List<User> getAllUser(){
		
		String displayQuery="select * from user";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(displayQuery);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			List<User> users= new ArrayList<>();
			
			while (resultSet.next()) {
				User user=new User();
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				
				
				users.add(user);
				
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public User getUserByEmail(String userEmail) {
		
		List<User> users=getAllUser();
		
		for (User user : users) {
			if (userEmail.equals(user.getEmail())) {
				
				return user;
			}
		}
		return null;
		
		
	}
}
