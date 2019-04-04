package com.revature.daos;

import java.util.Set;

import com.revature.models.Bear;

public interface BearDao {

	Bear save(Bear b);
	Bear update(Bear b);
	Bear delete(Bear b);
	
	Bear findById(int id);
	
	Set<Bear> findByColor(String color);
	Set<Bear> findByCaveId(int caveId);
	
	
}
