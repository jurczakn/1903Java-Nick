package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		 * Redirect 
		 * 		- give a url to a new resource
		 * 		- response will tell the client to send another request for this resource
		 * 		- Pro: client is aware of new url
		 * 		- Con: slower
		 */
		System.out.println("inside doGet of RedirectServlet");
		resp.sendRedirect("forward-servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		 * Redirect 
		 * 		- give a url to a new resource
		 * 		- response will tell the client to send another request for this resource
		 * 		- Pro: client is aware of new url
		 * 		- Con: slower
		 */
		System.out.println("inside doPost of RedirectServlet");
		resp.sendRedirect("forward-servlet");
	}
	
	

}
