package com.thread;



public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		Runnable r = new MyThread();
		Thread t2 = new Thread(r);
		t1.start();
		//t1.join();
		System.out.println("thread "+t1.getId() +" completed");
		t2.start();
		System.out.println("thread " +t2.getId() +" completed");
		for(int i=0;i<2;i++) {
			System.out.println(i+" From main thread");
		}

	}

}
