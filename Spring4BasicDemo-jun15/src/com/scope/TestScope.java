package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestScope {

	public static void main(String[] args) {
	
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("scope.xml");
		Customer c =(Customer)context.getBean("customer");
		System.out.println(c.getName());

		System.out.println("returns same ouput if scope is singleton");
		System.out.println("returns diff ouput if scope is prototype");
		c.setName("john");
		Customer c1 =(Customer)context.getBean("customer");
		System.out.println("Second Object "+c1.getName());
		System.out.println("First Object "+c.getName());

}

}
