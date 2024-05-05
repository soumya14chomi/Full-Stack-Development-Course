package com.collection;

import java.util.Objects;

public class Employee {

	private Integer id;
	private String name;
	private float salary;
	private String address;
	public Employee(Integer id, String name, float salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, salary);
	}
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(this == obj)	return true;
		if(obj == null)	return false;
		if(getClass()!=obj.getClass())	return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Finalize from Employee called");
	}

}
