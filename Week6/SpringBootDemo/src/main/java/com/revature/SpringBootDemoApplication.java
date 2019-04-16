package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication	//Marks the application as a Spring Boot Application
						//This annotation encompasses several other annotations
						//including: @Configuration, @EnableAutoConfiguration
						//and @ComponentScan. If any of these annotations require
						//further configuration, they can be added without issue.

@EnableJpaRepositories	//This will allow Spring Data. Comment out until ready.
public class SpringBootDemoApplication {
	/**
	 * Welcome to Spring Boot.
	 * One of the features of Spring Boot is that it will deploy
	 * itself. When the main method is run, we call
	 * SpringApplication.run(Application.class, args); which will
	 * deploy your application to a TomCat server spun up by the
	 * application for that purpose.
	 */

	public static void main(String[] args) {
		/**
		 * By default, because of the Actuator dependency we added in the pom file,
		 * all we need to deploy a successful Restful webservice is this java class.
		 * Before we do anything else, please run this program. as a SpringBootApp
		 * localhost:8080/health, localhost:8080/beans, localhost:8080/env
		 * 
		 * Because dev-tools are in the build path, they are active, and if you make
		 * a change (such as writing a comment) while the application is running and
		 * save, the server will be restarted with your "changes"
		 * add a new comment
		 */
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}

