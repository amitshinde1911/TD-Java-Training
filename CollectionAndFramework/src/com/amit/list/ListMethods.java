package com.amit.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>();
		
		for(int i=10; i <= 100 ; i+=10) {
			list.add(i);
		}
		
		System.out.println("List : "+list);
		
		list.add(2, 100);
		
		System.out.println("List after insertion : "+list);
		
		list.set(3, 200);
		
		System.out.println("List after replacement : "+list);
		
		List<Integer> secList = new ArrayList<>();
		
		secList.add(111);
		secList.add(222);
		secList.add(333);
		secList.add(444);
		
		System.out.println("Second List : "+secList);
		
		list.addAll(3, secList);
		
		System.out.println("first List : "+list);
		
		if(list.contains(228)) {
			System.out.println("List has the value");
		}
		else
			System.out.println("list does not have the value");
		
		System.out.println("Elements in the list are : ");
		for(int i=0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(3);
		
		System.out.println("List after deletion : "+list);
	}

}
