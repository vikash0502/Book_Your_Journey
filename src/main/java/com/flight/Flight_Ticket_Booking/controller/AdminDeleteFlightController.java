package com.flight.Flight_Ticket_Booking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.Flight_Ticket_Booking.service.AdminAddFlightService;

@SuppressWarnings("serial")
@WebServlet("/deleteFlight")
public class AdminDeleteFlightController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AdminAddFlightService addFlightService = new AdminAddFlightService();
		
		addFlightService.deleteFlight(Integer.parseInt(req.getParameter("flightNumber")));
		
		RequestDispatcher dispatcher= req.getRequestDispatcher("admin-flight-details.jsp");
		dispatcher.forward(req, resp);
	}
}
