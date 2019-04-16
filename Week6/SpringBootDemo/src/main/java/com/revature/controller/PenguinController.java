package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bean.Penguin;
import com.revature.dao.PenguinRepo;

@RestController("/penguin")
public class PenguinController {
	
	@Autowired
	PenguinRepo pRepo;
	
	@GetMapping
	public List<Penguin> getAllPenguins(){
		return pRepo.findAll();
	}
	
	@PostMapping
	public void makePenguin(@RequestBody Penguin p){
		pRepo.save(p);
	}

}
