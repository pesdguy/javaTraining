package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

	
	@Override
	public double area(int x, int y) {
		System.out.print("Rectangle  ");
		return x*y;
	}
	

}
