package com.revature;

import com.revature.beans.BankUser;
import com.revature.utils.BankUserDeserializer;
import com.revature.utils.BankUserSerializer;

public class Driver {

	public static void main(String[] args) {
		BankUserSerializer bus = new BankUserSerializer();
		bus.serializeUser(new BankUser("Damani", "revature123", "10987654321", 5_000_000_000.0, "123456789"));
		
		BankUserDeserializer bud = new BankUserDeserializer();
		BankUser bankUser = bud.deserializeUser();
		
		System.out.println(bankUser);
		
		float f;
		
		//System.out.println(f);
	}
	
}
