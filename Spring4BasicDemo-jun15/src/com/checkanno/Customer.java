package com.checkanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mycustomer")
public class Customer {
	
	String name;
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	@Autowired
	
	Address address;
	public String getName() {
		return name;
	}
	@Value("Ram")
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
