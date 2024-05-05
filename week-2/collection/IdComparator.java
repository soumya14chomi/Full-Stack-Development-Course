package com.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	public IdComparator() {
		// TODO Auto-generated constructor stub

	}
	public int compare(Employee e1, Employee e2) {
		return e1.getId().compareTo(e2.getId());
	}
}

