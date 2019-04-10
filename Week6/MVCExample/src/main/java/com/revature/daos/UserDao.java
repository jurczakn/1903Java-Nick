package com.revature.daos;

import java.util.List;

import com.revature.pojos.User;

public interface UserDao {
	
	public User getUser(String username);
	public void saveUser(User user);
	public void updateUser(String username, User user);
	public void deleteUser(String username);
	public List<User> getAllUsers();

}
