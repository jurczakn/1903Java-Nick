package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet LifeCycle:
 * 
 * init		- Initializes the servlet in the servlet container (web container)
 * 			- Called once
 * 				Either on first request or on startup
 * 
 * service	- Handles a request to this servlet.  Basically forwards request to appropriate method (doGet, doPost, doDelete, doHead ...)
 * 			- NOTE: this method is abstract in GenericServlet
 * 			- NOTE: this method is implemented in HttpServlet
 * 			- Called on every request to the Servlet
 * 
 * destroy	- Destroys the Servlet
 * 			- Typically called when the servlet container stops/restarts
 * 				- Most likely not called during normal operations
 * 				- usually only on shutdown and only once
 */


public class LifecycleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("Inside doGet of LifecycleServlet");
		resp.getWriter().write("<h1 >Success</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("Inside doPost of LifecycleServlet");
		resp.getWriter().write("Successful call");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LifecycleServlet is servicing request");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("LifecycleServlet is being destroyed");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("LifecycleServlet id being initialized");
		super.init();
	}
	
	

}
