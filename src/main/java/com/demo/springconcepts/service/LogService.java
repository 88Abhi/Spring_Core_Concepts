package com.demo.springconcepts.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

// Service class for generating Log
@Service
public class LogService {
	// Create a Logger instance for the service layer
	private static final Logger logger = LoggerFactory.getLogger(LogService.class);

	// Method to return a getLog message
	public String getLog() {
		logger.debug("Executing logGreeting() method");

		// Log an info message for the greeting
		logger.info("Returning the Log message");
		return "Hello from Spring Concepts with SLF4J!";
	}
}