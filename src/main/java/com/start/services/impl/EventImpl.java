package com.start.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.start.dto.EventRequest;
import com.start.entity.User;
import com.start.entity.UserEvent;
import com.start.repository.MYRepository;
import com.start.repository.UserEventRepository;
import com.start.services.EventInterface;


@Service
public class EventImpl implements EventInterface {
	
	@Autowired
	private UserEventRepository event;
	
	@Autowired
	private MYRepository userRepo;
	
	

	@Override   // UserEvent
	public UserEvent saveEventData(EventRequest userevent) {
	         
		int user_id = userevent.getUser_id();
		
		 User user= userRepo.getById(user_id);
		 
		     UserEvent obj=new UserEvent();
		     
		     obj.setUser(user);
             obj.setTitle(userevent.getName());	
             
		     
		
		
		
		UserEvent save = event.save(obj);
		return save;
	}

	

}
