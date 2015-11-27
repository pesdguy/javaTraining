package com.javabased;

import org.springframework.context.annotation.Primary;


public class BaseCalc implements Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

}
