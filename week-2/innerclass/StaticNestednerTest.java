package com.innerclass;

class Outer2{
	private Integer i=10;
	static void test1(){
		System.out.println("Inside the method");
	}
	static class InnerClass {
		static void test() {
			System.out.println("Inside the static inner method");
			test1();
		}
	}
}
public class StaticNestednerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 o2 = new Outer2();
		Outer2.InnerClass.test();

	}

}
