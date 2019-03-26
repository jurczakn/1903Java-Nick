package com.revature.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside do get of ForwardServlet");
		resp.getWriter().write("Get from ForwardServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * forward
		 * 		- give url for the resource
		 * 		- pass the req and resp objects to the new resource
		 * 		- the new resource responds back to the client
		 * 		Pros: faster (only 1 request and response sent)
		 * 		Cons: client unaware of what is happening (could be a plus)
		 */
		System.out.println("inside doPost of ForwardServlet");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/redirect-servlet");
		requestDispatcher.forward(req, resp);
	}
	
	
	
	

}
