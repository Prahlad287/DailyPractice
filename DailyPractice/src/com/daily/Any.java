package com.daily;

import java.util.Scanner;

public class Any {
	static int i;
	static double d;
	
	public static void sum(byte... l) {
		
		System.out.println("byte");
	}
	public static void sum(Short...l) {

		System.out.println("Short");
	}
	public static void sum(int... l) {

		System.out.println("int");
	}
	public static void sum(long... l) {

		System.out.println("long");
	}
	public static void sum(float... f) {

		System.out.println("float");
	}
	public static void sum(double... d) {

		System.out.println("Double");
	}
	public static void sum(char... d) {

		System.out.println("Char");
	}
	public static void sum(int a, String name, int... c) {
		int sum = a + c[1];
		System.out.println(sum);
	}

		public static void main(String... a) {

		byte b = -127;
		char c = (char) b;
//		sum(10.0f, 10.5d, 20, 20.5f, 100.52, b, c);
//		sum(20.0f, 5000, 20.30);
//		sum(c);
//		sum(b);
		sum('5');
		
		
		String name;
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter your name : ");
		  name = sc.nextLine(); //assume if user enters 'cppbuzz'
		  
		  switch(name.length()){
		   
		    case 5: 
		    case 6:
		    case 7:
		    case 8:
		    case 9:
		    case 10: System.out.print("Length is  5-10"); break;
		    default: System.out.print("Length not in 5-10");
		  }
	}

}
