package com.flight.Flight_Ticket_Booking.service;

import com.flight.Flight_Ticket_Booking.dao.AdminAddFlightDao;
import com.flight.Flight_Ticket_Booking.dto.AdminAddFlight;

public class AdminAddFlightService {

	AdminAddFlightDao dao=new AdminAddFlightDao();
	/*
	 * addFlight
	 */
	
	public AdminAddFlight adminAddFlight(AdminAddFlight addFlight) {
		return dao.adminAddFlight(addFlight);
	}
	
	/*
	 * delete flight
	 * 
	 */
	public int deleteFlight(int flightNumber) {
		return dao.deleteFlight(flightNumber);
	}
	
}
