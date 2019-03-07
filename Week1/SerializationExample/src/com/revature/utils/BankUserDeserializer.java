package com.revature.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.revature.beans.BankUser;

public class BankUserDeserializer {
	
	private static final String FILENAME = "bank_user.dat";
	
	public BankUser deserializeUser(){
		
		BankUser bankUser = null;
		
		try {
			FileInputStream fileIn = new FileInputStream(FILENAME);
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			bankUser = (BankUser) in.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bankUser;
		
	}

}
