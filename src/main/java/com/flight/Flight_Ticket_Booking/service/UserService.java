package com.flight.Flight_Ticket_Booking.service;

import com.flight.Flight_Ticket_Booking.dao.UserDao;
import com.flight.Flight_Ticket_Booking.dto.User;

public class UserService {

	UserDao dao = new UserDao();
	
	/*
	 * save User details
	 */
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	public User getUserByEmail(String userEmail) {
		
		return dao.getUserByEmail(userEmail);
	}
}
