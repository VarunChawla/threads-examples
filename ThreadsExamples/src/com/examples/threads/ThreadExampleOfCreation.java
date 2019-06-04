package com.examples.threads;

public class ThreadExampleOfCreation {
	public static void main(String args[]) {
		new Thread(new HelloRunnable()).start();
		
		(new HelloThread()).start();
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello using Runnable interface "+Thread.currentThread().getName());
			}
			
		};
		
		//Reason for () thiss is --> Since runnable interface do not contains any parameters
		Runnable r2 = () -> {
			System.out.println("Hello using Runnable interface lamda expression "+Thread.currentThread().getName());
		};
		
		Thread t1 = new Thread (r1,"Thread t1");
		t1.start();
		
		Thread t2 = new Thread(r2,"Thread t2");
		t2.start();
	}
}
