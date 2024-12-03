package com.amit.udemy;

public class Test {

	public static void main(String[] args) {

		Product product = new Product(1, "Iphone 16");
		
		System.out.println(product); //prints objects reference not actual values
		
		String s = "123";
		
		Integer i = new Integer(456);
		
		System.out.println(s);
		System.out.println(i);
	}

}
