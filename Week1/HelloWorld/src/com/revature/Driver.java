package com.revature;

public class Driver {
	
	private static final String MSG = "Hello World";
	
	static public void main(String pirateSounds[]){
		
		System.out.println(MSG);
		
		WebApp webApp = new WebApp();
		
		webApp.setHeader("some web app header setting up stuff like location and styling maybe");
		
		System.out.println(webApp.getHeader());
		
		System.out.println(webApp.getForms());
		
		System.out.println(webApp);
		
		return;
		
	}

}
