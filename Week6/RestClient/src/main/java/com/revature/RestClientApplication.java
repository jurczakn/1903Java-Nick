package com.revature;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController("/api")
public class RestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}
	
	@GetMapping
	public String testGet() {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/MVCExample/";
		
		ResponseEntity<List<User>> responseEntity = 
				restTemplate.exchange(
						url+"user", 
						HttpMethod.GET, 
						null, 
						new ParameterizedTypeReference<List<User>>() {}
						);
		
		List<User> allUsers = responseEntity.getBody();
		HttpStatus httpStatus = responseEntity.getStatusCode();
		
		StringBuilder result = new StringBuilder("Response from Rest API: ");
		result.append(allUsers.toString());
		result.append(" with a status code of ");
		result.append(httpStatus.value());
		
		System.out.println(result);
		
		return result.toString();
		
	}

}
