<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="">
		<form action="flightBooking" method="post">
			
			<label id="PassengerName">PassengerName</label><br>
			<input type="text" placeholder="enter passenger name" name="userName"><br>
			
			<label id="PassengeuserEmail">PassengeEmail</label><br>
			<input type="email" placeholder="enter Passenge email" name="PassengeEmail"><br>
			
			<label id="PassengeuserAge">PassengeAge</label><br>
			<input type="email" placeholder="enter Passenge age" name="PassengeEmail"><br>
			
			<label id="PassengeuserGender">Gender</label><br>
			
			<input type="radio" placeholder="enter Passenge gender" name="PassengeEmail"><br>
			
			<input type="submit" value="BookYourFlight">
		</form>
	
	</div>
</body>
</html>