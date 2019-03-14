package com.revature.utils;

public class Zombies {
	
	private LoggingUtil log = new LoggingUtil();

	String name;
	
	public Zombies(String name){
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		log.logInfo("After eating several brains, tradgicially " + this.name + " has died, again");
	}
	
	

}
