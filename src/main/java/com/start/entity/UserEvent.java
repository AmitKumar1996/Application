package com.start.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEvent {
	
	// Event: title, start_time, end_time, 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eventid;
	String title;
	/**
	 * @return the eventid
	 */
	public int getEventid() {
		return eventid;
	}
	/**
	 * @param eventid the eventid to set
	 */
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	public UserEvent(int eventid, String title) {
		super();
		this.eventid = eventid;
		this.title = title;
	}
	public UserEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserEvent [eventid=" + eventid + ", title=" + title + "]";
	}
	
	

}
