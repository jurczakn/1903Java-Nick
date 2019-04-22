package com.revature;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/driver")
public class RaceCarDriversController {
	
	@GetMapping
	public List<String> getAllDrivers(){
		ArrayList<String> drivers = new ArrayList<String>();
		drivers.add("Ariton Senna");
		drivers.add("Louise Hamilton");
		drivers.add("Dale Earnheart Jr.");
		return drivers;
	}

}
