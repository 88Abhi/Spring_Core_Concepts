package com.demo.springconcepts;

import com.demo.springconcepts.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Main class to start Spring Boot Application
@SpringBootApplication
public class SpringConceptsApplication {
	// Create a Logger instance
	private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	// Main method to run the application
	public static void main(String[] args) {
		// Log an info message at startup
		logger.info("Starting Spring Concepts Application...");

		// Load the Spring ApplicationContext
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);

		// Retrieve the EmployeeBean from the context
		EmployeeBean employee = context.getBean(EmployeeBean.class);

		// Display employee details
		employee.displayEmployeeDetails();

		// Log a success message after starting
		logger.info("Spring Concepts Application started successfully.");
	}
}
