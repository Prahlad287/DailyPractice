package com.multithreading;

import org.apache.pdfbox.pdmodel.fixup.processor.AcroFormOrphanWidgetsProcessor;

public class Main {
	public void go() {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
			System.out.println("foo");
				
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
		//thread.start();
	}
	public static void main(String[] args) {
		new Main().go();

	}

}
