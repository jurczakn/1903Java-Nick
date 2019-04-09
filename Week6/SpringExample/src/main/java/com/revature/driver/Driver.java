package com.revature.driver;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.BrokenDoor;
import com.revature.beans.DoorInterface;
import com.revature.beans.House;

public class Driver {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
	
	public static void main(String[] args) {
		/*
		 * House house = new House(); house.setName("Toby"); Door door = new
		 * Door("wood"); house.setDoor(door);
		 * System.out.println("Look at our new house: " + house);
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotate.xml");
		House house = (House) ac.getBean("house");
		//System.out.println(house);
		log.log(Level.INFO, house.toString());
		house.setName("Toby");
		house.getDoor().setMaterial("wood");
		//System.out.println(house);
		log.log(Level.INFO, house.toString());
		
		House house2 = (House) ac.getBean("house");
		house2.setName("Janit");
		DoorInterface brokenDoor = ac.getBean(BrokenDoor.class);
		house2.setDoor(brokenDoor);
		log.log(Level.INFO, "house2: " + house2);
		log.log(Level.INFO, "house: " + house);
	}

}
