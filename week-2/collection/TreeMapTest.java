package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<Employee, String> tm = new TreeMap<>(new IdComparator());
		tm.put(new Employee(101, "Soumya", 1000f, "Hyderaad"), "Dev");
		tm.put(new Employee(101, "Soumya", 1000f, "Hyderaad"), "QA");
		tm.put(new Employee(102, "Ravi", 100f, "Banglore"), "QA");
		tm.put(new Employee(103, "Shruthi", 100f, "Hyd"), null);
		tm.put(new Employee(103, "Shruthi", 100f, "Hyd"), null);		//tm.put(null, null)
		//System.out.println(tm);
		
		Set<Employee> s = tm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Employee e =  (Employee) itr.next();
			System.out.println(e+" "+tm.get(e));
		}
	}

}
