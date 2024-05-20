package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.Customer;
import com.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("Bean.xml");

//		Employee emp = cxt.getBean("e", Employee.class);
//
//		System.out.println(emp);
//
//		Employee emp1 = cxt.getBean("e", Employee.class);
//
//		System.out.println(emp.hashCode() + " " + emp1.hashCode());

		// has-A relationship

		Customer cust = cxt.getBean(Customer.class);

		Address address = cust.getAddress();

		cust.setId(101);

		cust.setName("Soumya");

		cust.setAge(20);

		address.setId(1);

		address.setStreet("dj");

		address.setState("PA");

		address.setCountry("USA");

		System.out.println(cust);

		cxt.close();

	}

}
