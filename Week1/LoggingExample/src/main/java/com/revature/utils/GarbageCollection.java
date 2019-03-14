package com.revature.utils;

/*
 * Java Garbage Collection runs automatically
 * It will clean up all objects that are no longer being used
 * When it runs it destroys all objects in memory that no longer have a reference
 */
public class GarbageCollection {

	private static LoggingUtil log = new LoggingUtil();
	
	public static void main(String[] args) {
		
		log.logTrace("Inside main method");
		
		int i = 0;
		
		for(int j = 0;j<1000;j++){
			log.logDebug("Loop #: " + ++i);
			new Zombies("Zombie #:" + i);
			if(i%50 == 0){
				log.logDebug("Suggesting Garbage Collection");
				System.gc();
			}
		}
		
	}
	
}
