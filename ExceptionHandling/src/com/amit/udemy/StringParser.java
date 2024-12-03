package com.amit.udemy;

import java.util.Scanner;

public class StringParser {

	public static void main(String[] args) {

		String s = "amit";
		try {
		int n = Integer.parseInt(s);
		System.out.println(n);
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter a number in string format");
		}
		
		System.out.println("This is line after catch block");
	}

}
