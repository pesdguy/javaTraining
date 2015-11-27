package com.setterDI;

import java.util.Iterator;
import java.util.List;

public class Student {
 
	String name;
	List<String > books;
	List<Courses> courseList;
	
	public List<Courses> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Courses> courseList) {
		this.courseList = courseList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public String getName() {
		return name;
	}
	
	List<String> getBooks(){
		return books;
		}
	
}
