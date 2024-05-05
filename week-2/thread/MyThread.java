package com.thread;

public class MyThread extends Thread{
//		public void start() {
//			run();
//		}
		public void run() {
			System.out.println("Inside the thread: "+Thread.currentThread().getId());
			Thread.yield();
			for(int i=0;i<2;i++) {
				//System.out.println(i+ " Running Concurrently "+Thread.currentThread().getId());
				try {
					Thread.sleep(1000);
					System.out.println("Hello from Thread-"+Thread.currentThread().getId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Completed Thread "+Thread.currentThread().getId());
		}
}
