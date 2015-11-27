package com.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("constDIforEmp.xml");

		Employee emp = (Employee)context.getBean("myemp");
		System.out.println(emp);

		Employee emp1 = (Employee)context.getBean("myemp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee)context.getBean("myemp2");
		System.out.println(emp2);
		// throw ambiguity exception
		/*Employee emp3 = (Employee)context.getBean("myemp3");
		System.out.println(emp3);*/
	}
		
		
		
		
		
		
		
	
}
