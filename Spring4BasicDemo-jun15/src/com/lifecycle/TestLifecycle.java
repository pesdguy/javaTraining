package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
	//Logger logger = Logger.getLogger(TestLifecycle.class);

	public static void main(String[] args) {
		
		//BasicConfigurator.configure();

		// use abstract application context to shutdown
		// annotation,inbuilt methods,custom method called in order

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanlife.xml");
		CustomBean e = (CustomBean) context.getBean("custom");
		System.out.println(e.getMessage());
		context.registerShutdownHook();

		System.out.println("AA " + e.getMessage());// calls this line before
													// closing container
		context.close();
	}
}
