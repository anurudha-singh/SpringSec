package com.anurudh.SpringSec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		// run method is also creates the container or context of the spring boot application
		SpringApplication.run(SpringSecurityApplication.class, args);// we are determining the entry point for our application 
		System.out.println("Server is running ....");
	}

}
