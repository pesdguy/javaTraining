package com.checkanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	public static void main(String[] args) {
		
	//Using only  Annotation configuration and no xml configuration file 
	ApplicationContext context = new 
			AnnotationConfigApplicationContext("com.checkanno");
	Customer customer = (Customer)context.getBean(Customer.class);
	System.out.println(customer);
	
	// using xml with componentscan and  no beans in xml
		ApplicationContext contextxml = new 
				ClassPathXmlApplicationContext("annotationbean.xml");
		Customer customer1 = (Customer)contextxml.getBean(Customer.class);
		System.out.println(customer1);
		 customer1 = (Customer)contextxml.getBean("mycustomer");
		System.out.println(customer1);
	
		// using xml with annotation config and with bean definition file
	 //cannot understand @Component
		ApplicationContext contextall = new 
				ClassPathXmlApplicationContext("annotationbean.xml");
		Customer cust = (Customer)contextall.getBean("mycustomer");
		System.out.println(cust);
	}
}
