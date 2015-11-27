package com.autowire;


public class Square  implements Shape {


	@Override
	public double area(int x, int y) {
		System.out.println("Square");
		return x*x;
	}
	
}
