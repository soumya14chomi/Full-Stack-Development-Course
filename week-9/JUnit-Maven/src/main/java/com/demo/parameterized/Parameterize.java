package com.demo.parameterized;

public class Parameterize {

	public static boolean isPalindrome(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}

}
