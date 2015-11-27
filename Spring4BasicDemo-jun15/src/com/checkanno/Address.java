package com.checkanno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	String city,state;

	public String getCity() {
		return city;
	}
	@Value(value="Bangalore")
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	@Value(value="Karnataka")
	public void setState(String state) {
		this.state = state;
	}
}
