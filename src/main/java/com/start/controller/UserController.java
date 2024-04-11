package com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.start.entity.User;
import com.start.services.userService;

@RestController
public class UserController {
	@Autowired
	private userService service;
	
	
	

	
	@PostMapping("/save")
	public User saveUserData(@RequestBody User user) {
		   User saveData = service.saveData(user);
		 
		
		return saveData;
	}
	
	
	
	

}
