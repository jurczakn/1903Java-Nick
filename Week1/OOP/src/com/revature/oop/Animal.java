package com.revature.oop;

public class Animal {
	
	private int weight;
	
	private int numberOfLegs;
	
	private String name;
	
	private String breed;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public final void eat(String food){
		System.out.println("The " + this.getBreed() + " is now eating the " + food);
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", numberOfLegs=" + numberOfLegs + ", name=" + name + ", breed=" + breed
				+ "]";
	}
	
	public Animal(int weight, int numberOfLegs, String name, String breed){
		super();
		this.setWeight(weight);
		this.setNumberOfLegs(numberOfLegs);
		this.setName(name);
		this.setBreed(breed);
		System.out.println("Inside args based constructor of Animal class");
		
	}
	
	public Animal(){
		this(10, 10, "", "");
		System.out.println("Inside no args constructor of Animal class");
	}

}
