package com.anurudh.SpringSec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// import com.anurudh.SpringSec.model.Person;
// import com.anurudh.SpringSec.model.Person2;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		// run method is also creates the container or context of the spring boot application
	// ConfigurableApplicationContext config=	SpringApplication.run(SpringSecurityApplication.class, args);// we are determining the entry point for our application 
		System.out.println("Server is running ....");
		// Person p1= config.getBean(Person.class);
		// System.out.println("Person name is ::"+p1.name);

		// Person2 p2=config.getBean(Person2.class);
		// System.out.println("Person name is ::"+p2.name);
	}


}
