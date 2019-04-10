package com.revature.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelpController {
	
	private static Logger log = Logger.getLogger("HelpController");
	
	@RequestMapping("/help")
	public String getHelp() {
		log.log(Level.INFO, "Inside Help Controller");
		return "redirect:resources/help.html";
	}

}
