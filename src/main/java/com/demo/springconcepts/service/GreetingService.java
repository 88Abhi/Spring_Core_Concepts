package com.demo.springconcepts.service;

import org.springframework.stereotype.Service;

// Service class for generating greetings
@Service
public class GreetingService {
	// Method to return a greeting message
	public String getGreeting() {
		return "Hello from Spring Concepts!";
	}
}