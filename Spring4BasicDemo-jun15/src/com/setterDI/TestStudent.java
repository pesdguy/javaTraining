package com.setterDI;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("setterDI.xml");
		Student stud = (Student)context.getBean("studbean1");
		List<String> booklist = stud.getBooks();
		for (String bookname : booklist) {
			System.out.println(bookname);
		}
		List<Courses> courseList = stud.getCourseList();
		for (Courses courseName : courseList) {
			System.out.println(courseName);
		}
		
		Student stud2 = (Student)context.getBean("studbean2");
		
		List<String> booklist2 = stud2.getBooks();
		for (String bookname : booklist2) {
			System.out.println(bookname);
		}
		List<Courses> courseList2 = stud2.getCourseList();
		for (Courses courseName : courseList2) {
			System.out.println(courseName);
		}
	}

}
