package com.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	@Bean(initMethod="init",destroyMethod="customDestroy")
	public Customer getCustomer(){
		return new Customer();
	}

}
