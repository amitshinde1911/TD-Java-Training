package com.amit.spring.springcore.innerbeans.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springcore/innerbeans/assignment/config.xml");
		University uni = (University) ctx.getBean("university");
		System.out.println(uni);
		System.out.println(uni.hashCode());
		
		University uni2 = (University) ctx.getBean("university");
		System.out.println(uni2);
		System.out.println(uni2.hashCode());
		
		University uni3 = (University) ctx.getBean("university");
		System.out.println(uni3);
		System.out.println(uni3.hashCode());
		
		
		
	}
	
	
	


}
