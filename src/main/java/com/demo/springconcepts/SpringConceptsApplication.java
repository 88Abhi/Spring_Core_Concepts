package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main class to start Spring Boot Application
@SpringBootApplication
public class SpringConceptsApplication {
	// Create a Logger instance
	private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	// Main method to run the application
	public static void main(String[] args) {
		// Log an info message at startup
		logger.info("Starting Spring Concepts Application...");

		SpringApplication.run(SpringConceptsApplication.class, args);

		// Log a success message after starting
		logger.info("Spring Concepts Application started successfully.");
	}
}
