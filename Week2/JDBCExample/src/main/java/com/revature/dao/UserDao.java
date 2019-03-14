package com.revature.dao;

import java.util.List;

import com.revature.bean.User;

public interface UserDao {
	
	public void createUser(User u);
	
	public void updateUser(User u);
	
	public void deleteUser(User u);
	
	public User getUserById(Integer id);
	
	public User getUserByUsername(String username);
	
	public List getAllUsers();

}
