package com.model;

import org.springframework.stereotype.Component;

@Component
public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}

	private Integer id;
	private String street;
	private String state;
	private String country;

	public Address(Integer id, String street, String state, String country) {
		super();
		this.id = id;
		this.street = street;
		this.state = state;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", state=" + state + ", country=" + country + "]";
	}

}
