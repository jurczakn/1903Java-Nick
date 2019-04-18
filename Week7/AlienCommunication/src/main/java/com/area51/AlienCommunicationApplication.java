package com.area51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AlienCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlienCommunicationApplication.class, args);
	}

}
