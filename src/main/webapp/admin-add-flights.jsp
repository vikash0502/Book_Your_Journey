<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	
	.common{
		width: 200px;
		height: 30px;
	}
	
	body {
	display: flex;
	flex-direction:column;
	justify-content: center;
	align-items: center;
   }

</style>
</head>
<body>
	<div>
		<jsp:include page="admin-navbar.jsp"></jsp:include>
	</div>
	<div style="color:back;">
		<form action="flightAdd" method="post">

			<label id="myflight">Flight-Number</label><br>
			<input type="number" placeholder="enter flight number" name="flightNumber" class="common"><br>
			
			<label id="myflight">Flight-Name</label><br>
			<input type="text" placeholder="enter flight name" name="flightName" class="common"><br>
			
			<label id="Source">Flight-Source</label><br>
			<input type="text" placeholder="enter flight source" name="flightsource" class="common"><br>
			
			<label id="Destination">Flight-Destination</label><br>
			<input type="text" placeholder="enter flight destination" name="flightDestination" class="common"><br>
			
			<label id="departure">Flight-Departure-Time</label><br>
			<input type="time" placeholder="enter flight departure time" name="flightDeparture" class="common"><br>
			
			<label id="arrival">Flight-Arrival-Time</label><br>
			<input type="time" placeholder="enter flight arrival time" name="flightArrival" class="common"><br>
			
			
			<label id="myPrice">Flight-economy-Price</label><br>
			<input type="number" placeholder="enter flight Economy price" name="flightEconomyPrice" class="common"><br>
			<br>
			
			<label id="myPrice">Flight-Business-Price</label><br>
			<input type="number" placeholder="enter flight Business price" name="flightBusinessPrice" class="common"><br>
			
			<br>
			<input type="submit" value="Add" style="width: 50px; height: 30px;">

		</form>

		</div>
	

</body>
</html>