package com.setterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("setterDI.xml");
		Employee e =(Employee)context.getBean("employee");
		System.out.println(e);
				
		Employee as =(Employee)context.getBean("innemp");
		System.out.println(as);
		

		
	}

}
