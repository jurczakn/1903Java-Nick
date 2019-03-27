package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.Animals;

public class AnimalService {
	
	private static List<Animals> animalDao;
	
	public void createAnimal(Animals a) {
		animalDao.add(a);
	}
	
	public Animals findAnimalByName(String name){
		Animals ret = null;
		
		for(Animals a : animalDao){
			if (a.getName().equals(name)){
				ret = a;
				break;
			}
		}
		
		return ret;
		
	}

	public AnimalService() {
		super();
		animalDao = new ArrayList<Animals>();
		animalDao.add(new Animals("Ahmed", "human-coder", "person-color", 25));
		animalDao.add(new Animals("Simba", "lion", "brown", 1));
	}
	
	

}
