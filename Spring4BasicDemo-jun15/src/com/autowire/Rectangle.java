package com.autowire;

public class Rectangle  implements Shape {

	@Override
	public double area(int x, int y) {
		System.out.println("rectangle");
		return x*y;
	}

}
