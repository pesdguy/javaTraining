package com.autowire;

public class ShapeFactory {

	Shape shape;

	public ShapeFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShapeFactory(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void calculateArea(int x, int y) {
		System.out.print("Calculating Area");
		System.out.println(shape.area(x, y));

	}
}
