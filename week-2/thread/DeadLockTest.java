package com.thread;

public class DeadLockTest {
	public static void main(String[] args) {
		DeadLockTest t1=new DeadLockTest();
		final A a =t1.new A();
		final B b= t1.new B();
		
		Runnable block1 = new Runnable() {
			public void run() {
				synchronized(a){
					try {
						System.out.println("Block-1 started");
						Thread.sleep(1000);
						System.out.println(b.getI());
					}catch(Exception e) {
						e.printStackTrace();
					}
//					synchronized(b){
//						System.out.println("Block-1 End");
//					}
				}
			}
		};
		
		Runnable block2 = new Runnable() {
			public void run() {
				synchronized(b){

					System.out.println("Block-2 started");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						e.printStackTrace();
					}

					System.out.println(a.getI());
//					synchronized(a){
//						System.out.println("Block-2 End");
//					}
				}
			}
		};
		new Thread(block1).start();
		new Thread(block2).start();
		
		
	}
	private class A{
		private int i=10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
	}
	private class B{
		private int i=20;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
	}
}
