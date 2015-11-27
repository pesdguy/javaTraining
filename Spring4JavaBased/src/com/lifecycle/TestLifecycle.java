package com.lifecycle;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
	Logger logger = Logger.getLogger(TestLifecycle.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();

		ApplicationContext context = 
		new AnnotationConfigApplicationContext(CustomerConfig.class);
		Customer e = context.getBean(Customer.class);
		System.out.println(e.getMessage());
		}
}
