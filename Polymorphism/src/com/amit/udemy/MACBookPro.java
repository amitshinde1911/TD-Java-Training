package com.amit.udemy;

public class MACBookPro extends MACBook {
	
	@Override
	public void start() {
		
		System.out.println("Inside MacBookPros start method");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MacBookPros shutdown method");
	}
	
	public void prosMethod() {
		System.out.println("Inside MacBookPros prosMethod method");
	}
	
	

}
