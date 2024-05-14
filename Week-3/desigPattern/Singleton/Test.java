package com.desigPattern.Singleton;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Singleton singleton = Singleton.getInstanceDC();
		singleton.test();
		//Singleton s1  = (Singleton) singleton.clone();
		
		Singleton s2 = Singleton.getInstanceDC();
		s2.test();

	}

}
