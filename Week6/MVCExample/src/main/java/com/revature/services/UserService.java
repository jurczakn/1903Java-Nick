package com.revature.services;

import java.util.List;

import com.revature.pojos.User;

public interface UserService {
	
	public User getUserByUsername(String username);
	public List<User> getAllUsers();
	public void removeUser(String username);
	public User changeUser(String username, User user);
	public User addUser(User user);
	

}
