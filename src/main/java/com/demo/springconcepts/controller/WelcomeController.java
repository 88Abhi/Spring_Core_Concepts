package com.demo.springconcepts.controller;

import com.demo.springconcepts.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// REST Controller to handle HTTP requests
@RestController
@RequestMapping("/api")
public class WelcomeController {
	// Injecting GreetingService using @Autowired
	@Autowired
	private GreetingService greetingService;

	// Mapping GET request to /api/welcome
	@GetMapping("/welcome")
	public String displayWelcomeMessage() {
		// Call service method to return the greeting
		return greetingService.getGreeting();
	}
}