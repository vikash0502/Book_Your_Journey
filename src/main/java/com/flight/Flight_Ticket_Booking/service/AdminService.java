package com.flight.Flight_Ticket_Booking.service;

import java.util.List;

import com.flight.Flight_Ticket_Booking.dao.AdminDao;
import com.flight.Flight_Ticket_Booking.dto.Admin;

public class AdminService {

	AdminDao adminDao = new AdminDao();
	
	public List<Admin> getAllAdmins(){
		return adminDao.getAllAdmins();
	}
	
	/*
	 * getDataByEmail
	 */
	public Admin getAdminByEmail(String adminEmail) {
		return adminDao.getAdminByEmail(adminEmail);
	}
}
