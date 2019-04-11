package com.revature.services;

import org.springframework.stereotype.Component;

@Component("monkeyService")
public class MonkeyService {

	public void eatBananas() {
		System.out.println("The monkey is eating a banana");
	}
	
	public void climbTrees() {
		System.out.println("The monkey is climbing a tree");
	}
	
	public void assertDominance() {
		System.out.println("The monkey is beating its chest");
	}
	
}
