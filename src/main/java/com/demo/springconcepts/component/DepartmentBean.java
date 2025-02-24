package com.demo.springconcepts.component;

import org.springframework.stereotype.Component;

// DepartmentBean is a Spring-managed component
@Component
public class DepartmentBean {
	// Property for department name
	private String departmentName = "Software Development";

	// Method to return the department name
	public String getDepartmentName() {
		return departmentName;
	}
}