package com.amit.udemy;

import java.io.FileNotFoundException;

public class ThrowKeyword {

	public static void main(String[] args) throws FileNotFoundException {

//		throw new RuntimeException("Funds not available");
		
		throw new FileNotFoundException("");
	}

}
