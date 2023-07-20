package com.flight.Flight_Ticket_Booking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.Flight_Ticket_Booking.dto.User;
import com.flight.Flight_Ticket_Booking.service.UserService;

@WebServlet("/userRegister")
public class UserRegisterController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		String confirmPassword = req.getParameter("confirmPassword");
		
		User  user = new User();
		
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		UserService service = new UserService();
		
		if(password.equals(confirmPassword)) {
			service.saveUser(user);
			RequestDispatcher  dispatcher = 
					req.getRequestDispatcher("user-login.jsp");
			dispatcher.forward(req, resp);
		}else {
			req.setAttribute("msg", "mismatch-Password");
			RequestDispatcher  dispatcher = 
					req.getRequestDispatcher("user-registration.jsp");
			dispatcher.forward(req, resp);
		}
		
		
	}
}
