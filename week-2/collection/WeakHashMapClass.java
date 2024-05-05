package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Map<Employee, Integer> whm = new WeakHashMap<>();
		Employee e = new Employee(101, "Soumya", 100f, "Hyd");
		whm.put(e, 1);
		e=null;
		System.out.println(whm);
		System.gc();
		Thread.sleep(1000);
		System.out.println(whm);
		System.out.println("==============================================");
		
		Map<Employee, Integer> hm = new HashMap<>();
		Employee e1 = new Employee(101, "Soumya", 100f, "Hyd");
		hm.put(e1, 1);
		e=null;
		System.out.println(hm);
		System.gc();
		Thread.sleep(1000);
		System.out.println(hm);

	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Finalize called");
	}

}
