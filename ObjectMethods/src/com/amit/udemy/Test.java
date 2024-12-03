package com.amit.udemy;

public class Test {

	public static void main(String[] args) {

		Passenger passenger = new Passenger();
		passenger.setId(10);
		passenger.setFirstName("Amit");
		passenger.setLastName("Shinde");
		
		
		Passenger passenger1 = new Passenger();
		passenger1.setId(10);
		passenger1.setFirstName("Amit");
		passenger1.setLastName("Shinde");
		
		System.out.println(passenger);
		
		System.out.println(passenger.hashCode());
		
		System.out.println(passenger.equals(passenger1));
	}

}
