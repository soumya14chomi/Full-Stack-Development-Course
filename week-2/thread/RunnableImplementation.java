package com.thread;

class MyThread6 implements Runnable{
	public void run() {
		//yield();
		for(int i=0;i<10;i++) {
			System.out.println("From child Thread6: "+Thread.currentThread().getId());
		}
		System.out.println(Thread.currentThread().getPriority());
	}

}
class MyThread7 implements Runnable{
	public void run() {
		//Thread.currentThread().yield();;
		for(int i=0;i<10;i++) {
			System.out.println("From child Thread7: "+Thread.currentThread().getId());
		}
		System.out.println(Thread.currentThread().getPriority());
	}

}

public class RunnableImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 r1= new MyThread6();
		MyThread7 r2 = new MyThread7();
		Thread t7 = new Thread(r1);
		Thread t8 = new Thread(r2);
		t7.start();
		t8.setPriority(1);
		t8.start();
		//t7.notify();
		for(int i=0;i<10;i++) {
			System.out.println("From Main Thread");
		}

	}

}
