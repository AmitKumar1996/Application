package com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.start.dto.EventRequest;
import com.start.entity.UserEvent;
import com.start.services.EventInterface;

@RestController
public class EventControler  {
	@Autowired
	private EventInterface ev;
	
	@PostMapping("/event")
	public UserEvent getInfo(@RequestBody EventRequest userevent) {
		 
		 
		UserEvent saveEventData = ev.saveEventData(userevent);
       		
	   return saveEventData;
	}
	
	

}
