package com.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		List ll = new LinkedList();
		ll.add("100");
		ll.add(100.5);
		ll.add("Hello");
		ll.add(null);
		System.out.println(ll);
		//Collections.sort(ll);
		// System.out.println(ll);
		System.out.println("================================");
		
		System.out.println(ll.get(1));
		System.out.println(ll.remove(1));
		System.out.println(ll.indexOf("Hello"));
		System.out.println(ll);
		System.out.println("=================================");
		
		Collections.synchronizedList(ll);
		System.out.println("=================================");
		
		List<Employee> ll2 = new LinkedList<>();
		ll2.add(new Employee(101, "Soumya", 100000, "1001 Hyderabad"));
		ll2.add(new Employee(107, "Teena", 10000000, "L B Nagar"));
		ll2.add(new Employee(102, "Ravi", 10903, "Banglore"));
		System.out.println(ll2);
		Collections.sort(ll2, new IdComparator());
		System.out.println(ll2);
		System.out.println("=================================");
		
		ListIterator it = ll2.listIterator()	;
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			//it.remove();
		}
		//System.out.println(ll2);
		System.out.println(it.hasNext());
		System.out.println(it.hasPrevious());
		System.out.println(it.nextIndex());
		System.out.println(it.previousIndex());
		System.out.println("======================================");
		
		Collections.sort(ll2, new NameComparator());
		System.out.println(ll2);
		
	}
	
}