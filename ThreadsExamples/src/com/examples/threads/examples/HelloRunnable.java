package com.examples.threads.examples;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello using implementing a runnable interface using thread "+Thread.currentThread().getName());
	}

}
