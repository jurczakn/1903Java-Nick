package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.User;

public class UserService {
	
	List<User> userDao;
	
	public User loginUser(String username, String password){
		
		System.out.println("username " + username);
		System.out.println("password " + password);
		
		User user = null;
		
		for (User check : userDao){
			if(check.getUsername().equals(username) && check.getPassword().equals(password)){
				user = check;
				break;
			}
		}
		
		return user;
		
	}
	
	public UserService(){
		userDao = new ArrayList<User>();
		userDao.add(new User("ahmed123", "1234", "Ahmed S"));
		userDao.add(new User("khang321", "4321", "Khang T"));
	}

}
