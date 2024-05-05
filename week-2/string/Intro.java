package com.string;

import java.io.PrintStream;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		out.println("Hello");
		String str1 ="Hello", str2 ="Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1.equals(str3));
		System.out.println(str4==str2);
		System.out.println("==================================");
		Employee e1 = new Employee("Soumya");
		Employee e2 = new Employee("Soumya");
		
		System.out.println(e1.equals(e2));
		
	}

}
