package com.start.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.start.entity.UserEvent;
import com.start.repository.UserEventRepository;
import com.start.services.EventInterface;


@Service
public class EventImpl implements EventInterface {
	
	@Autowired
	private UserEventRepository event;

	@Override   // UserEvent
	public UserEvent saveEventData(UserEvent userevent) {
	          UserEvent save = event.save(userevent);
		return save;
	}

	

}
