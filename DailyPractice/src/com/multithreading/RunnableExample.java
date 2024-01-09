package com.multithreading;

public class RunnableExample implements Runnable {
	
	public void run() {
		System.out.println("Hello this is class");
		
	}
	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello this is interface");
				
			}
		};
		RunnableExample run1=new RunnableExample();
		Thread thread=new Thread(run1);
		thread.start();
		

	}

}
