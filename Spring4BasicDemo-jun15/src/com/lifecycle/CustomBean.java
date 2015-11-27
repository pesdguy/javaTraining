package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomBean implements InitializingBean,DisposableBean{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialising bean called");
	}
	public void destroy(){
		System.out.println("Disposable bean called");
	}	
	
	
	@PostConstruct
	public void annoinit(){
		System.out.println("init using @@ annotation");
	}
	@PreDestroy
	public void annodestroy(){
		System.out.println("destroy using @@ annotation");
	}
	
	public void init(){
		System.out.println("from custom init method......");
	}
	public void customDestroy(){
		System.out.println("destroying custom destroy method.......");
	}

	

	
}
