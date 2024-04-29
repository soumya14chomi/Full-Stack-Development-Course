package com.test.poly;

class Test{
	void test() {
		System.out.println("test-1");
	}
	void test(int p) {
		System.out.println("test-3");
	}
	void test(float p) {
		System.out.println("test-2");
	}
	int test(String str) {
		System.out.println(str);
		return -1;
	}
}
public class Polymorphism {
	void test() {
		System.out.println("test-1");
	}
	void test() {
		System.out.println("test-2");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.test(2);
		System.out.print(t.test("Hello num:"));
	}
}
