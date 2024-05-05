package com.thread;

class MyThread8 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("From Child Thread"+ Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread8 t8 = new MyThread8();
		MyThread8 t9 = new MyThread8();
		t8.start();
		t9.start();
		t8.join();
		for(int i=0;i<10;i++) {
			System.out.println("From Main Thread");
		}

	}

}
