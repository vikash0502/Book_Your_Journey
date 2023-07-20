<%@page import="com.flight.Flight_Ticket_Booking.dto.AdminAddFlight"%>
<%@page import="java.util.List"%>
<%@page import="com.flight.Flight_Ticket_Booking.dao.AdminAddFlightDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String source= request.getParameter("source");
	String destination=request.getParameter("destination");
  		AdminAddFlightDao addFlightDao=new AdminAddFlightDao();

		List<AdminAddFlight> addFlights=addFlightDao.getAllFlights();
%>
	<div>
	
	<table border="1px">
	
	<tr>
	<th>Image</th>
	<th>FlightNumber</th>
	<th>FlightName</th>
	<th>Source</th>
	<th>Destination</th>
	<th>Departure</th>
	<th>Arrival</th>
	<th>Economy</th>
	<th>Business</th>
	<th>Delete</th>
	
	</tr>
	
	<%
			for(AdminAddFlight addFlight:addFlights){
	%>		
		<% if(addFlight.getFlightName().equalsIgnoreCase("indigo")) {%>
			<tr>
				<td><img alt="indigo" src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/IndiGo_Airlines_logo.svg/2560px-IndiGo_Airlines_logo.svg.png" width="150px" height="50px"></td>
				<td><%= addFlight.getFlightNumber() %></td>
				<td><%= addFlight.getFlightName() %></td>
				<td><%= addFlight.getFlightSource()%></td>
				<td><%= addFlight.getFlightDestination()%></td>
				<td><%= addFlight.getDepatureTime()%></td>
				<td><%= addFlight.getArrivalTime()%></td>
				<td><%= addFlight.getFlightEconomyPrice()%></td>
				<td><%= addFlight.getBusinessPrice()%></td>
				<td><a href="bookFlight?flightNumber=<%= addFlight.getFlightNumber() %>"><button>Book your flight</button></a></td>
				
				
			</tr>
			
		<%} %>
		<% } %>		
		
	</table>
	
	
	</div>
</body>
</html>