package com.demo.springconcepts.controller;

import com.demo.springconcepts.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// REST Controller to handle HTTP requests
@RestController
@RequestMapping("/api")
public class LogController {
	// Create a Logger instance for the controller layer
	private static final Logger logger = LoggerFactory.getLogger(LogController.class);

	// Injecting LogService using @Autowired
	@Autowired
	private LogService logService;

	// Mapping GET request to /api/log
	@GetMapping("/log")
	public String displayWelcomeMessage() {
		logger.info("Received request at /api/log");

		// Call service method to return the log
		String message = logService.getLog();

		// Log the returned message
		logger.debug("Log message: {}", message);
		return message;
	}
}