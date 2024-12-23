package com.amit.spring.springcore.propertyplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amit.spring.springcore.propertyplaceholder.MyDAO;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springcore/propertyplaceholder/assignment/config.xml");
		com.amit.spring.springcore.propertyplaceholder.assignment.MyDAO dao =  (com.amit.spring.springcore.propertyplaceholder.assignment.MyDAO) ctx.getBean("myDAO");
		System.out.println(dao);
	}

}
