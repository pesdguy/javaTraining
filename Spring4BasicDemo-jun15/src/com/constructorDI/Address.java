package com.constructorDI;





public class Address {

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	String city,state;

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
