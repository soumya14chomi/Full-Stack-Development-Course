package com.innerclass;

public class AnonymousClassWithThreads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable r =new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++) {
					System.out.println("From Child");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					
				}
			}
			
		};
		Thread t =new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("From Parent Thread");
			Thread.sleep(500);
		}

	}

}
