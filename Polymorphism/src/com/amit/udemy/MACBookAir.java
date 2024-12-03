package com.amit.udemy;

public class MACBookAir extends MACBook {
	
	@Override
	public void start() {
		
		System.out.println("Inside MacbookAir start method");
	}
	
	@Override
	public void shutdown() {
		
		System.out.println("Inside MacbookAir shutdown method");
		
	}

}
