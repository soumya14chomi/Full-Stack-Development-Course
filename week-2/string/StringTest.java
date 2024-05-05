package com.string;

public class StringTest {
	public static void main(String[] args) {
		String str = new String("Hello!");
		String str1 = str.concat("Hi!!");
		
		StringBuffer str2 = new StringBuffer("Hello!");
		StringBuffer str3 = str2.append("Hi!");
		
		System.out.println(str+" "+str1);
		System.out.println(str2+" "+str3);
		
		System.out.println(str2==str3);
	}

}
