package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.services.MonkeyService;
import com.revature.services.ParrotService;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		MonkeyService monkey = ac.getBean(MonkeyService.class);
		ParrotService parrot = ac.getBean(ParrotService.class);
		
		monkey.assertDominance();
		monkey.climbTrees();
		monkey.eatBananas();
		parrot.climbCage();
		parrot.eatNuts();
		parrot.mock();
		
	}

}
