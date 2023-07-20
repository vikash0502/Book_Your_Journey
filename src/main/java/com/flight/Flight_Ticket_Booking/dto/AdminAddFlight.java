package com.flight.Flight_Ticket_Booking.dto;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.flight.Flight_Ticket_Booking.connection.FlightConnection;

public class AdminAddFlight {

	private int flightNumber;
	private String flightName;
	private String flightDestination;
	private String flightSource;
	private Time depatureTime;
	private Time arrivalTime;
	private double flightEconomyPrice;
	private double businessPrice;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public Time getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(Time depatureTime) {
		this.depatureTime = depatureTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getFlightEconomyPrice() {
		return flightEconomyPrice;
	}

	public void setFlightEconomyPrice(double flightEconomyPrice) {
		this.flightEconomyPrice = flightEconomyPrice;
	}

	public double getBusinessPrice() {
		return businessPrice;
	}

	public void setBusinessPrice(double businessPrice) {
		this.businessPrice = businessPrice;
	}

}
