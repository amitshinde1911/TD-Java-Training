package com.amit.spring.springcoreadvanced.autowiring.assignment;

public class Reservation {
	
	private int id;
	
	private String time;

	@Override
	public String toString() {
		return "Reservation [id=" + getId() + ", time=" + getTime() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
