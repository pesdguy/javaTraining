package com.autowire;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beansautowire.xml");
		System.out.println("Autowiring by Name");
		ShapeFactory factory = (ShapeFactory) context.getBean("shapefac1");
		factory.calculateArea(10,20);
		
		System.out.println("Autowiring by Type");
		ShapeFactory factory1 = (ShapeFactory) context.getBean("shapefac2");
		factory1.calculateArea(20,20);
		
		System.out.println("Autowiring by constructor");
		ShapeFactory factory2 = (ShapeFactory) context.getBean("shapefac3");
		factory2.calculateArea(10,20);
		
//		Scanner sc = new Scanner(System.in);
//		String choice = sc.next();
//		if (choice.equals("rect")) {
//			ShapeFactory factory = (ShapeFactory) context.getBean("shapefac1");
//			factory.getMyShape();
//		} else if (choice.equals("sq")) {
//			ShapeFactory factory = (ShapeFactory) context.getBean("shapefac2");
//			factory.getMyShape();
//		} else if (choice.equals("circle")) {
//			ShapeFactory factory = (ShapeFactory) context.getBean("shapefac3");
//			factory.getMyShape();
//		} else {
//			System.out.println("select a proper choice");
//		}
        
	}

}