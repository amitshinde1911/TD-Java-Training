package com.amit.udemy;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		int a,b,c;
		try {
		System.out.println("Enter two integers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a / b;
		
		System.out.println("Result is : "+c);
		}
		catch(RuntimeException e) {
		System.out.println("Please enter 0");
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("More Code can go from here");
	}

}
