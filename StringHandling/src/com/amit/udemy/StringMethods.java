package com.amit.udemy;

public class StringMethods {

	public static void main(String[] args) {

		String s = "Hello Amit";
		
		System.out.println("length of str is : "+s.length());
		System.out.println("index of : "+s.indexOf('o'));
		System.out.println("char at : "+s.charAt(0));
		
		System.out.println("Substring with beginning index : "+s.substring(2));
		
		System.out.println("Substring with begin and end index : "+s.substring(0,3));
		
		String[] split = s.split(" ");
		for(int i=0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println(s.replace('A', 'S'));
		
		System.out.println("UpperCase: "+s.toLowerCase());
		System.out.println("LowerCase: "+s.toUpperCase());
	}

}
