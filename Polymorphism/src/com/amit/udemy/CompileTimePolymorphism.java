package com.amit.udemy;

public class CompileTimePolymorphism {
	
	void add(int a,int b) {
		int result = a + b;
		System.out.println("Result is "+result);
	}
	
	void add(int a,int b,int c) {
		int result = a + b + c;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		CompileTimePolymorphism ctp = new CompileTimePolymorphism();
		ctp.add(10, 20);
		ctp.add(30, 40, 50);
		
	}

}
