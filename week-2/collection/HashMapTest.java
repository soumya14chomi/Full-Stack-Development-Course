package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> hm = new HashMap<>();
		hm.put(new Employee(101, "Soumya", 1000f, "Hyderaad"), "Dev");
		hm.put(new Employee(101, "Soumya", 1000f, "Hyderaad"), "Dev");
		hm.put(new Employee(102, "Ravi", 100f, "Banglore"), "QA");
		hm.put(new Employee(103, "Shruthi", 100f, "Hyd"), null);
		System.out.println(hm);

	}

}
