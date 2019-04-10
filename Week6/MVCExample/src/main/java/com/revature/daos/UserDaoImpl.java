package com.revature.daos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.pojos.User;

@Component
public class UserDaoImpl implements UserDao {
	
	private static List<User> userRepo;

	@Override
	public User getUser(String username) {
		User ret = null;
		Iterator<User> userIterator = userRepo.iterator();
		while (userIterator.hasNext()) {
			User u = (User) userIterator.next();
			if (u.getUsername().equals(username)) {
				ret = u;
				break;
			}
		}
		return ret;
	}

	@Override
	public void saveUser(User user) {
		userRepo.add(user);
	}

	@Override
	public void updateUser(String username, User user) {
		Iterator<User> userIterator = userRepo.iterator();
		while (userIterator.hasNext()) {
			User u = (User) userIterator.next();
			if (u.getUsername().equals(username)) {
				userIterator.remove();
				userRepo.add(user);
				return;
			}
		}
	}

	@Override
	public void deleteUser(String username) {
		Iterator<User> userIterator = userRepo.iterator();
		while (userIterator.hasNext()) {
			User u = (User) userIterator.next();
			if (u.getUsername().equals(username)) {
				userIterator.remove();
			}
		}
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo;
	}

	public UserDaoImpl() {
		super();
		userRepo = new ArrayList<User>();
		userRepo.add(new User("1234", "nick", "Nick J"));
		userRepo.add(new User("1234", "matt", "Matt J"));
	}
	
}
