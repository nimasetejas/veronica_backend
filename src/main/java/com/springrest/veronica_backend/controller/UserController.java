package com.springrest.veronica_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/home")
	public String home() {
		
	
		return "This is home page";
		
	}

}
