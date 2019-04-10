package com.revature.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.pojos.User;
import com.revature.services.AuthService;

@Controller
public class LoginController {
	
	private static Logger log = Logger.getLogger("LoginController");
	
	AuthService authService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet(HttpSession sess, ModelMap modelMap) {
		if (sess.getAttribute("user") != null) {
			modelMap.addAttribute("user", sess.getAttribute("user"));
			return "home";
		} else {
			log.log(Level.INFO, "Sess User : " + sess.getAttribute("user"));
		}
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPost(User user, HttpSession sess, ModelMap modelMap){
		User authUser = authService.validateUser(user);
		log.log(Level.INFO, "AuthUser: " + authUser);
		
		if (authUser != null) {
			sess.setAttribute("user", authUser);
			modelMap.addAttribute("user", authUser);
			return "home";
			
		}
		
		return "login";
		
		
	}

	@Autowired
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	
	

}
