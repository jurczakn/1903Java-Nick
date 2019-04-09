package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.beans.Door;
import com.revature.beans.House;
import com.revature.beans.LifeCycleBean;

@Configuration
public class ConfigurationClass {
	
	@Bean()
	@Scope("prototype")
	public House house() {
		return new House();
	}
	
	@Bean
	@Scope("prototype")
	public Door door() {
		return new Door();
	}
	
	@Bean(initMethod = "myCustomInit", destroyMethod = "myCustomDestroy")
	@Scope("singleton")
	public LifeCycleBean lifeCycle() {
		return new LifeCycleBean();
	}

}
