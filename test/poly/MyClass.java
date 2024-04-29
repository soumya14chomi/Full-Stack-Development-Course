package com.test.poly;

public abstract class MyClass {
	int firstIndex;
	int lastIndex;
	abstract void test();
	//abstract void test1();
	
	MyClass(int firstIndex, int lastIndex){
		this.firstIndex = firstIndex;
		this.lastIndex = lastIndex;
	}
	
	void test2() {
		System.out.println("from Abstract class test-2");
	}
}
