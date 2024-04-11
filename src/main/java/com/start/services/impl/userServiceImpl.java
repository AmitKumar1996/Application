package com.start.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.start.entity.User;
import com.start.repository.MYRepository;
import com.start.services.userService;

@Service
public class userServiceImpl implements userService {
    
	@Autowired
	private MYRepository repo;
	
	
	
	@Override
	public User saveData(User user) {
		
		User save = repo.save(user);
		
		return save;
	}
	

	

}
