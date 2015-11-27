package com.setterDI;

public class Courses {
	String name;
	int fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Courses [name=" + name + ", fees=" + fees + "]";
	}
	

}
