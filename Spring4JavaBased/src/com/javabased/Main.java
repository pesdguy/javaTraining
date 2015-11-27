package com.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CalcConfig.class);
		Calculator calc = context.getBean(Calculator.class);
		System.out.println("Addition "+calc.add(10, 20));
		
		/*calc = (Calculator)context.getBean(Calculator.class,"calculator");
		System.out.println("multiply " +calc.multiply(10, 20));*/
		
		/*building the container programmatically */
		AnnotationConfigApplicationContext pcontext = new AnnotationConfigApplicationContext();
		pcontext.register(CalcConfig.class);
		pcontext.refresh();
		 
		Calculator advCalc = context.getBean(Calculator.class);
		System.out.println(advCalc.add(100, 20));

	}

}
