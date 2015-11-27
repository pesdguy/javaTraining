package com.constructorDI;



public class Student {
 
	String name;
	Address address;
	int id;
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", id=" + id
				+ "]";
	}
	
}
