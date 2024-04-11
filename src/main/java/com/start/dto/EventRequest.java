package com.start.dto;

public class EventRequest {
	
	private int  user_id;
    String name;
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public EventRequest(int user_id, String name) {
		super();
		this.user_id = user_id;
		this.name = name;
	}
	public EventRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EventRequest [user_id=" + user_id + ", name=" + name + "]";
	}
    
	   

}
