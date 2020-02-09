package com.examples.threads.examples;

public class HelloThread extends Thread{

	@Override
	public void run() {
		System.out.println("Hello using Extending Thread class thread "+Thread.currentThread().getName());
	}

}
