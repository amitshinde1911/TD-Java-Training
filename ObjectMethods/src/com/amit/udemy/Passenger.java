package com.amit.udemy;

public class Passenger {

	private int id;

	private String firstName;

	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Passenger information is : " + this.firstName + " " + this.lastName;
	}

	@Override
	public int hashCode() {
		return id + firstName.length() + lastName.length();
	}

	@Override
	public boolean equals(Object obj) {
		Passenger passenger = (Passenger) obj;
		
		if(passenger.id == this.id && passenger.getFirstName().equals(this.firstName) 
				&& passenger.getLastName().equals(this.lastName)) {
			return true;
		}
		else {
			return false;
		}
	}

}
