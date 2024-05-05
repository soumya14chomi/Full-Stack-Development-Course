package com.innerclass;

interface Example{
	void test();
}

class Example1{
	Example1(){
		this.test();
	}
	void test() {
		System.out.println("From Class test");
	}
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Example mi =new Example() {

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Interface");
			}
			
		};
		
		mi.test();
		
		Example1 ex2 = new Example1() {
			@Override
			void test() {
				//super.test();
				System.out.println("From ex2");
			}
		};
		ex2.test();
	}

}
