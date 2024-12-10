package com.amit.spring.springcore.lc.xmlconfig;

public class Patient {
	
	private int id;

	public int getId() {
		System.out.println("Inside getter method");
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("Inside hi() method");
	}
	
	public void bye() {
		System.out.println("Inside bye() method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
	
	

}
