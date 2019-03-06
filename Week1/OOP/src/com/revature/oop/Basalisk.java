package com.revature.oop;

public class Basalisk extends Animal{
	
	private static final String BREED = "basalisk";
	
	private int numberOfWings;
	
	public int getNumberOfWings() {
		return numberOfWings;
	}



	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}

	public void fly(){
		System.out.println("The basalisk is flying");
	}

	@Override
	public String getBreed(){
		return BREED;
	}
	
	public Basalisk(){
		//super() by default
		System.out.println("Inside Basalisk no args constructor");
	}
	
}