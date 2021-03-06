package com.revature.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.User;
import com.revature.services.AuthService;
import com.revature.services.UserService;

@RestController("/user")
@CrossOrigin(origins="*")
public class UserController {

	private UserService userService;
	
	private AuthService authService;

	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{username}")
	public User getUserByUsername(@PathVariable String username) {
		return userService.getUserByUsername(username);
	}
	
	@PostMapping(consumes = "application/json")
	public String makeUser(@RequestBody @Valid User user, BindingResult bindingResult, HttpServletResponse resp) {
		if(bindingResult.hasErrors()) {
			resp.setStatus(403);
			//log error message
			return bindingResult.getAllErrors().get(1).getDefaultMessage();
		} else {
			userService.addUser(user);
			return "success";
		}
	}
	
	@PostMapping(value="/user/validate", consumes = "application/json")
	public User validate(@RequestBody User user, HttpSession sess) {
		User authUser = authService.validateUser(user);
		
		if (authUser != null) {
			sess.setAttribute("user", authUser);
			return authUser;
			
		}
		
		return null;
		
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Autowired
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}

	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
