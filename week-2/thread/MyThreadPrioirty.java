package com.thread;

class MyThread4 extends Thread{
	public void run() {
		//Thread.currentThread().yield();;
		for(int i=0;i<10;i++) {
			System.out.println("From child Thread4: "+Thread.currentThread().getId());
		}
		System.out.println(Thread.currentThread().getPriority());
	}

}
class MyThread5 extends Thread{
	public void run() {
		//Thread.currentThread().yield();;
		for(int i=0;i<10;i++) {
			System.out.println("From child Thread5: "+Thread.currentThread().getId());
		}
		System.out.println(Thread.currentThread().getPriority());
	}

}
public class MyThreadPrioirty {

	public static void main(String[] args) throws InterruptedException {
		MyThread4 t =new MyThread4();
		MyThread5 t2 = new MyThread5();
		System.out.println(t.getPriority());
		t.setPriority(10);
		t2.setPriority(1);
		t.start();
		t2.start();
		//Thread.sleep(1000);
		for(int i=0;i<7;i++) {
			System.out.println("From Main Thread");
		}
	}
}
