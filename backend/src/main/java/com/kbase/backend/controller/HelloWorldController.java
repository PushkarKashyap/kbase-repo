package com.kbase.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World! Greetings from Spring Boot!!";
	}
	
}
