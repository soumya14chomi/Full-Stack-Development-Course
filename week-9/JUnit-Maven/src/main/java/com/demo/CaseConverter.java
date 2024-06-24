package com.demo;

public class CaseConverter {

	public String convertCase(String data) {

		String temp = "";
		if (data == null) {
			return "";
		} else if (data.length() == 0) {
			return "";
		} else if (data.length() == 0 && isNumber(data)) {
			return data;
		} else {
			for (int i = 0; i < data.length(); i++) {
				char x = data.charAt(i);
				x -= 32;
				temp = temp + (char) x;
			}
			return temp;
		}

	}

	public boolean isNumber(String str) {
		int x = str.charAt(0);
		if (x > 47 && x < 56) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new CaseConverter().convertCase("hello"));
	}

}
