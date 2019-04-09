package com.revature.beans;

import org.springframework.stereotype.Component;

@Component
public class BrokenDoor implements DoorInterface {

	@Override
	public String getMaterial() {
		return "Broken Material";
	}

	@Override
	public void setMaterial(String material) {
	}

	@Override
	public String toString() {
		return "BrokenDoor [material='Broken Material']";
	}
	
	

}
