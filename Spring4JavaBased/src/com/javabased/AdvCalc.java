package com.javabased;

public class AdvCalc implements Calculator {

	@Override
	public int add(int a, int b) {
		System.out.println("Advanced Calc");
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		System.out.println("Advanced");
		return a*b;
	}

}
