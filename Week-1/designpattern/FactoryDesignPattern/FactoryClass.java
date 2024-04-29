package com.designpattern.FactoryDesignPattern;

public class FactoryClass {
	public Employee getEmployee(String employee) {
		if(employee == null) return null;
		if(employee.equalsIgnoreCase("software"))	return new Software();
		if(employee.equalsIgnoreCase("Permanent"))	return new Permanent();
		if(employee.equalsIgnoreCase("Contractor"))	return new Contractor(); //loose coupling
		else return null;
	}
}
