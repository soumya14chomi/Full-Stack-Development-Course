package com.collection;

import java.util.Hashtable;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<Employee, String> ht = new Hashtable<>();
		ht.put(new Employee(101, "Soumya", 1000f, "Hyderaad"), "Dev");
		//ht.put(new Employee(101, "Soumya", 1000f, "Hyderaad"), "Dev");
		ht.put(new Employee(102, "Ravi", 100f, "Banglore"), "QA");
		//ht.put(new Employee(102, "Ravi", 100f, "Banglore"), "QA");
		ht.put(new Employee(103, "Shruthi", 100f, "Hyd"), null);
		//ht.put(null, null);
		System.out.println(ht);
	}

}
