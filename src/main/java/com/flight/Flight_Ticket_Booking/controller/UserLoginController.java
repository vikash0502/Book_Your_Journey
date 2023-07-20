package com.flight.Flight_Ticket_Booking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.Flight_Ticket_Booking.dto.User;
import com.flight.Flight_Ticket_Booking.service.UserService;

@SuppressWarnings("serial")
@WebServlet("/userLogin")
public class UserLoginController extends HttpServlet {
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
				HttpSession httpSession=req.getSession();
				
				String userEmail = req.getParameter("userEmail");
				String userPassword = req.getParameter("userPassword");
				
				UserService userService = new UserService();
				User user = userService.getUserByEmail(userEmail);
				
				if (user!=null) {
					if (user.getPassword().equals(userPassword)) {
						
						RequestDispatcher dispatcher=req.getRequestDispatcher("user-home.jsp");
						dispatcher.forward(req, resp);
					}else {
						httpSession.setAttribute("invalidPassword", "Invalid Password");
						RequestDispatcher dispatcher=req.getRequestDispatcher("user-login.jsp");
						dispatcher.forward(req, resp);
					}
				}
				else {
					httpSession.setAttribute("invalidEmail", "Invalid Email");
					RequestDispatcher dispatcher=req.getRequestDispatcher("user-login.jsp");
					dispatcher.forward(req, resp);
				}
				
				
			}
}
