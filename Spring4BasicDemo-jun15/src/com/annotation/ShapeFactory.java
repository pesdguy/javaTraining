package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

	
	@Autowired
	@Qualifier(value="square")
	Shape shape;
	
	public Shape getShape() {
		return shape;
	}

	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void calculateArea(int x, int y) {
		System.out.println("Calculating Area: ");
		System.out.println(shape.area(x, y));

	}
	
}
 