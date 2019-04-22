package com.revature.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfit extends WebSecurityConfigurerAdapter {
	
	@Override
	//Turn off Secutiry for out entire project, so PCF doesn't turn it on
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests().antMatchers("/*").permitAll();
		
	}

}
