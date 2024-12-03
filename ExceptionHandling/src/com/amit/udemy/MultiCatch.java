package com.amit.udemy;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
		String input = args[0];
		System.out.println("Input is : "+input);
		int output = Integer.parseInt(input);
		System.out.println("Output is : "+output);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required.");
		} catch (NumberFormatException e) {
			System.out.println("Please enter a number ");
		}
		finally {
			System.out.println("finally block");
		}
		
		
		System.out.println("More code can go from here");
	}

}
