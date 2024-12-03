package com.amit.udemy;

public class RunTimeBinding {
	
	public static void main(String[] args) {
		
		AppleLaptop m1 = new MACBookPro();  //upcasting
		AppleLaptop m2 = new MACBookAir();
		
		m1.start();
		m1.shutdown();
		
		
		MACBookPro m3 = (MACBookPro) m1; //downcasting
		m3.prosMethod();
		
		m2.start();
		m2.shutdown();
		
		
		
		MACBookAir m4 = (MACBookAir) m2;
	}

}
