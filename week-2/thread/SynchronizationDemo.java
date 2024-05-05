package com.thread;

public class SynchronizationDemo {
	public static void main(String[] args) {
		Display d =new Display();
		MyThread13 t1= new MyThread13(d, "Soumya");
		MyThread13 t2 = new MyThread13(d, "Shruthi");
		t1.start();
		t2.start();
	}
}
