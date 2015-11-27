package com.annotation;

import org.springframework.stereotype.Component;


@Component//(value="shape")
//@Component
public class Square implements Shape {

	@Override
	public double area(int x, int y) {
		System.out.print("Square ");
		return x*x;
	}
	

}
