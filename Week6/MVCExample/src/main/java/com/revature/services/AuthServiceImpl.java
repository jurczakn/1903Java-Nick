package com.revature.services;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.pojos.User;

@Service
public class AuthServiceImpl implements AuthService {
	
	private static final Logger log = Logger.getLogger("AuthService");

	private UserService userService;
	
	@Override
	public User validateUser(User user) {
		
		log.log(Level.INFO, "Attempted login: " + user);
		
		User validatedUser = userService.getUserByUsername(user.getUsername());
		
		log.log(Level.INFO, "Actual Credentials: " + validatedUser);
		
		if(validatedUser != null && validatedUser.getPassword().equals(user.getPassword())) {
			
			return validatedUser;
			
		}
		
		return null;
	}

	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public AuthServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthServiceImpl(UserService userService) {
		super();
		this.userService = userService;
	}
	
}
