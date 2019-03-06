package com.revature.oop;

public class InheritanceDriver {

	public static final void main(String[] args) {

		Animal animal = new Animal(100, 4, "Damani", "Human");

		animal.setName("rex");

		System.out.println(animal.getName());

		Animal basalisk = new Basalisk();

		basalisk.setName("my basalisk");

		basalisk.setBreed("another breed");

		basalisk.setWeight(100);

		basalisk.setNumberOfLegs(2);

		if (basalisk instanceof Basalisk) {
			((Basalisk) basalisk).setNumberOfWings(2);
		}
		
		Animal z = new Zurgling();
		
		feedAnimal(animal, "generic food");

		feedAnimal(basalisk, "basalisk food");
		
		feedAnimal(new Zurgling(), "zurgling food");
		
		feedAnimal(z, "some other foood");
		
		feedAnimal((Zurgling)z);
		
		
		
		//haveBasaliskFly((Basalisk)basalisk);
		
		Scopes.main(null);
		Scopes scope = new Scopes();
		scope.instanceInt = 7;

	}

	private static void feedAnimal(Animal animal, String food) {
		animal.eat(food);
	}
	
	private static void feedAnimal(Zurgling zurgling) {
		String food = "some food";
		System.out.println("The zurgling did not like " + food + " but it did eat your arm!!!");
	}
	
	private static void haveBasaliskFly(Basalisk basalisk){
		basalisk.fly();
		System.out.println("It has " + basalisk.getNumberOfWings() + " wings");
	}

}
