package com.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown =  true)
public class Person {
	int id;
	Phone phone = new Phone();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	
}
