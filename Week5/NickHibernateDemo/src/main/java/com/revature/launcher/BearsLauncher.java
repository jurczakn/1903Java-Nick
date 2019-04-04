package com.revature.launcher;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import com.revature.daos.BearDao;
import com.revature.daos.BearDaoImpl;
import com.revature.models.Bear;

public class BearsLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BearDao bd = new BearDaoImpl();
		ObjectMapper om = new ObjectMapper().registerModule(new Hibernate4Module());
		// bear with proxies
		Bear b = bd.findById(1);
		//don't print any of those proxies
		System.out.println("BearID " + b.getBearId() + " Color " + b.getColor() + " Breed " + b.getBreed() + " Legs " + b.getNumberOfLegs());
		
		//json printer of set of bears
		//we popped proxies in first method
		try {
			String json = om.writerWithDefaultPrettyPrinter().writeValueAsString(bd.findByCaveId(1));
			System.out.println(json);
			json = om.writerWithDefaultPrettyPrinter().writeValueAsString(bd.findByColor("brown"));
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
