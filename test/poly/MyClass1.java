package com.test.poly;

public class MyClass1 extends MyClass{
	
	MyClass1(){
		super(100, 200);
	}
	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("From MyClass-1 inherited");
		
	}

	void test1() {
		// TODO Auto-generated method stub
		System.out.println("From MyClass-1 not inherited");
	}

}
