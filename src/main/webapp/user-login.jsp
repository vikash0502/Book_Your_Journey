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
	String email = (String) request.getAttribute("invalidEmail");
	String password = (String) request.getAttribute("invalidPassword");
	%>
	<div class="">
		<form action="userLogin" method="post">
			<%
			if (email != null) {
			%>
			<h6 style="color: red"><%=email%></h6>
			<%
			}
			%>
			<label id="userEmail">UserEmail</label><br> <input type="email"
				placeholder="enter user email" name="userEmail"><br> 
				
				<%
			if (password != null) {
			%>
			<h6 style="color: red"><%=password%></h6>
			<%
			}
			%>
				<label
				id="userPassword">UserPassword</label><br> <input
				type="password" placeholder="enter user password"
				name="userPassword"><br> <input type="submit"
				value="Login">
		</form>
		<p>
			if not signup please....<a href="user-registration.jsp">signup</a>
		</p>
	</div>
</body>
</html>