package com.area51.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.area51.model.AlienBase;
import com.area51.repositories.AlienBaseRepo;

@RestController("/base")
public class AlienBaseController {
	
	private AlienBaseRepo abr;
	
	@GetMapping
	public List<AlienBase> getAllAlienBases(){
		return abr.findAll();
	}
	
	@PostMapping
	public void makeAlienBase(@RequestBody AlienBase alienBase){
		abr.save(alienBase);
	}
	
	@GetMapping("/test")
	public String test() {
		return "this alien base is working";
	}
	
	@Autowired
	public void setAbr(AlienBaseRepo abr) {
		this.abr = abr;
	}

}
