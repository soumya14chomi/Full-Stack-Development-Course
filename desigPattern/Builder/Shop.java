package com.desigPattern.Builder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone1 = new PhoneBuilder().setOs("IOS").setCamera(400).setBattery(500).build();
		System.out.println(phone1);
		Phone phone2 = new PhoneBuilder().setProcessor("Intel").setCamera(300).build();
		System.out.println(phone2);
		Phone phone3 = new Phone("IOS", "Intel", 23.00, 23, 23);
		System.out.println(phone3);
	}

}
