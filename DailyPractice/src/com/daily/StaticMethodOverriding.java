package com.daily;



class Static{
	static void show() {
		System.out.println("Main class");
	}
}

public class StaticMethodOverriding extends Static {
	static void show() {
		
		System.out.println("Sub Class");
	}
	static void show(int a) {
		System.out.println("This is int overloding");
	}
	static void show(String a) {
		System.out.println("This is String overloding");
	}
	public static void main(String [] args) {
		show();
		show(10);
		show("Prahlad");
		System.out.println();
	}
}
