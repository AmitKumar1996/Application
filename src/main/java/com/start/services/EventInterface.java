package com.start.services;

import com.start.dto.EventRequest;
import com.start.entity.UserEvent;

public interface EventInterface {
	
	public UserEvent saveEventData(EventRequest userevent);
          
}
