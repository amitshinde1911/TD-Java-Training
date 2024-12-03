package com.amit.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		list.add("Amit");
		list.add(new Integer(10));
		list.add(190);
		list.add(12);
		
//		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(list);
		
		
	}

}
