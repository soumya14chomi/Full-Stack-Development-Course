package com.string;

import java.util.Objects;


public class Employee {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
	
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(this == obj)	return true;
		if(obj == null)	return false;
		if(getClass()!=obj.getClass())	return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}
}
