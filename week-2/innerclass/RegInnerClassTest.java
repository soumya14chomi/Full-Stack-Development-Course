package com.innerclass;

class Outer{
	private Integer i=10;
	class InnerClass {
		void test() {
			i=30;
			System.out.println(i);
		}
	}
}

public class RegInnerClassTest {
	
	
	public static void main(String[] args) {
		Outer o= new Outer();
		Outer.InnerClass i = o.new InnerClass();
		i.test();
	}

}


