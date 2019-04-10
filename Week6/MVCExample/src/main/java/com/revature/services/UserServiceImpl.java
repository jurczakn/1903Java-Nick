package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.daos.UserDao;
import com.revature.pojos.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Override
	public User getUserByUsername(String username) {
		return userDao.getUser(username);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public void removeUser(String username) {
		userDao.deleteUser(username);;
	}

	@Override
	public User changeUser(String username, User user) {
		
		if(userDao.getUser(username)!=null) {
			userDao.updateUser(username, user);
			return user;
		}
		
		return null;
	}

	@Override
	public User addUser(User user) {
		
		if (userDao.getUser(user.getUsername())==null) {
			userDao.saveUser(user);
			return user;
		}
		
		return null;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

}
