package com.start.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserEvent {  // 1:M
	
	// Event: title, start_time, end_time, 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eventid;
	@ManyToOne
	User user;
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
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
