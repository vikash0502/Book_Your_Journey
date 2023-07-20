package com.flight.Flight_Ticket_Booking.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.Flight_Ticket_Booking.dto.AdminAddFlight;
import com.flight.Flight_Ticket_Booking.service.AdminAddFlightService;

@SuppressWarnings("serial")
@WebServlet("/flightAdd")
public class AdminAddFlightsController extends HttpServlet {
	
	@SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		AdminAddFlight addFlight=new AdminAddFlight();
		AdminAddFlightService addFlightService=new AdminAddFlightService();
		
		
		int flightNumber=Integer.parseInt(req.getParameter("flightNumber"));
		String flightName=req.getParameter("flightName");
		String flightsource=req.getParameter("flightsource");
		String flightDestination=req.getParameter("flightDestination");
		String deparTureTime=req.getParameter("flightDeparture");
		String arrivalTime=req.getParameter("flightArrival");
		double flightEconomyPrice=Double.parseDouble(req.getParameter("flightEconomyPrice"));
		double flightBusinessPrice=Double.parseDouble(req.getParameter("flightBusinessPrice"));
		
		DateFormat dateFormat=new SimpleDateFormat("HH:mm");
		
			Time aTime=null;
			Time dTime=null;
		try {
			aTime=new Time(dateFormat.parse(arrivalTime).getTime());
			dTime=new Time(dateFormat.parse(deparTureTime).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		addFlight.setFlightNumber(flightNumber);
		addFlight.setFlightName(flightName);
		addFlight.setFlightSource(flightsource);
		addFlight.setFlightDestination(flightDestination);
		addFlight.setArrivalTime(aTime);
		addFlight.setDepatureTime(dTime);
		addFlight.setFlightEconomyPrice(flightEconomyPrice);
		addFlight.setBusinessPrice(flightBusinessPrice);
		
		addFlightService.adminAddFlight(addFlight);
		RequestDispatcher dispatcher = req.getRequestDispatcher("admin-add-flights.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	
	

}