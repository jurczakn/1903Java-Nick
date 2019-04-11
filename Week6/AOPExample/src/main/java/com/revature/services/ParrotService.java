package com.revature.services;

import org.springframework.stereotype.Component;

@Component("parrotService")
public class ParrotService {
	
	public void eatNuts() {
		System.out.println("The parrot is eating some nuts");
	}
	
	public void climbCage() {
		System.out.println("The parrot made it to the top of the cage");
	}
	
	public void mock() {
		System.out.println("Wow that's impressive! The parrot sounded just like you!!");
	}

}
