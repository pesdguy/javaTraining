package com.constructorDI;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("constDIforStud.xml");
		Student stud1 = (Student)context.getBean("stud1");
		System.out.println(stud1);
		
		stud1 = (Student)context.getBean("stud2");
		System.out.println(stud1);
		
		stud1 = (Student)context.getBean("stud3");
		System.out.println(stud1);
	}

}
