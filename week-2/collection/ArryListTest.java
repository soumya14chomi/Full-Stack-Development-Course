package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArryListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls = new ArrayList();
		ls.add(1);
		ls.add(2);
		ls.add(17);
		ls.add(6);
		ls.add(null);
		ls.add("Hello");
		ls.add(17.89);
		
		System.out.println(ls.toString());
		System.out.println(ls.get(3));
		System.out.println(ls.remove(3));
		System.out.println(ls.get(3));
		System.out.println(ls.contains(17.89));
		System.out.println(ls.toString());
		
		ListIterator it = ls.listIterator()	;
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			//it.remove();
		}
		System.out.println(ls);
		System.out.println(it.hasNext());
		System.out.println(it.hasPrevious());
		System.out.println(it.nextIndex());
		System.out.println(it.previousIndex());
		System.out.println();
		
		
		}

}
