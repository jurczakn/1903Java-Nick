package com.revature.util;

import javax.servlet.http.HttpServlet;

import com.revature.servlets.ForwardServlet;
import com.revature.servlets.HelloWorldServlet;
import com.revature.servlets.HomeServlet;
import com.revature.servlets.LifecycleServlet;
import com.revature.servlets.LoginServlet;
import com.revature.servlets.PageNotFoundServlet;
import com.revature.servlets.RedirectServlet;

public class RequestHelper {
	
	private static HttpServlet forwardServlet = new ForwardServlet();
	private static HttpServlet helloWorldServlet = new HelloWorldServlet();
	private static HttpServlet homeServlet = new HomeServlet();
	private static HttpServlet lifecycleServlet = new LifecycleServlet();
	private static HttpServlet loginServlet = new LoginServlet();
	private static HttpServlet redirectServlet = new RedirectServlet();
	private static HttpServlet pnfServlet = new PageNotFoundServlet();
	
	private static final String PREFIX = "/FrontControllerExample/app/";
	
	
	public HttpServlet dispatchRequest(String path) {
		
		HttpServlet nextServlet = null;
		
		switch(path) {
		
		case PREFIX + "login":
			nextServlet = loginServlet;
			break;
			
		case PREFIX + "hello":
			nextServlet = helloWorldServlet;
			break;
			
		case PREFIX + "emphome":
			nextServlet = homeServlet;
			break;
			
		case PREFIX + "redirect-servlet":
			nextServlet = loginServlet;
			break;
			
		case PREFIX + "forward-servlet":
			nextServlet = loginServlet;
			break;
			
		case PREFIX + "lifecycle":
			nextServlet = lifecycleServlet;
			break;
			
		default: 
			nextServlet = pnfServlet;
			break;
		}
		
		return nextServlet;
		
	}

}
