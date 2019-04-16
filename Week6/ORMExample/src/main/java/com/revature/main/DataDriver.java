package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Example;

import com.revature.daos.BearDao;
import com.revature.domains.Bear;

public class DataDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("data.xml");
		
		BearDao bearDao = (BearDao) ac.getBean("bearDao");
		
		bearDao.save(new Bear(3, "grey", "hard", "polar", 3));
		
		System.out.println(bearDao.findAll());
		
		System.out.println(bearDao.findAllByBreed("polar"));
		
		
		Bear exampleBear = new Bear();
		exampleBear.setBreed("polar");

		Example<Bear> example = Example.of(exampleBear);
		
		System.out.println(bearDao.findAll(example));
		
		System.out.println(bearDao.findAllByBreedAndLegs("polar", 3));
		
	}

}
