package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoShape {

	public static void main(String[] args) {
		
		
		//Using only  Annotation configuration 
		//and no xml configuration file
		ApplicationContext context = new 
				AnnotationConfigApplicationContext("com.annotation");

		ShapeFactory factory = (ShapeFactory) context
				.getBean(ShapeFactory.class);
		System.out.println("Area ");
		factory.calculateArea(10, 90);
		
		// using xml with component scan and  no beans in xml
		ApplicationContext contextxml = new 
				ClassPathXmlApplicationContext("annotationbean.xml");
		
		ShapeFactory factory1 = (ShapeFactory) contextxml
				.getBean("shapeFactory");
		System.out.println("Area ");
		factory1.calculateArea(10, 90);
		
		// using xml with annotation config
		//and with bean definition file
		
		ApplicationContext contextall = new 
				ClassPathXmlApplicationContext("annotationbean.xml");
		ShapeFactory factory2 = (ShapeFactory) contextall
				.getBean("shapeFactory");
		
		factory2.calculateArea(10, 90);
		
		/*
		 * with annotation and xml xml overrides in byName
		 * in byType 
		 * annotation overrides using qualifier
		 * 
		 */
	}

}
