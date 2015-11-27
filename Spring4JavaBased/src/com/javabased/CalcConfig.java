package com.javabased;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

/*meta annotated with spring*/
@Configuration
public class CalcConfig {
	
	@Bean
	@Primary
	public Calculator getCalculator(){
		return new BaseCalc();
	}
	
	@Bean(name="mycalculator")
	@Scope("prototype")
	public Calculator getAdvCalculator(){
		return new AdvCalc();
	}
	

}
