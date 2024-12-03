package com.amit.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object objects[] = new Object[100000];

		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}

		long start = System.currentTimeMillis();
		
		List<Object> list = new LinkedList<>();
		for (Object object : objects) {
			list.add(object);
		}
		long end = System.currentTimeMillis();

		System.out.println("Time taken : " + (end - start));
	}

}
