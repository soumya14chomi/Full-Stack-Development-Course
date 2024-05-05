package com.innerclass;

class Outer1{
	private Integer i=10;
		void test(){
			System.out.println("Inside the method");
		class InnerClass {
			void test1() {
				i=20;
				System.out.println(i);
			}
		}
		InnerClass i=new InnerClass();
		i.test1();
	}
}

public class LocalMethodClass {
	public static void main(String[] args) {
	}
}
