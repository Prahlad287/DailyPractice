package com.practice.string;

import java.util.Scanner;

public class Palindromnumber {
	
	boolean palinDromNumber(int number) {
		int orignal=number;
		int duplicate=0;
		while (number>0) {
			int digit=number%10;
			duplicate=duplicate*10+digit; //1
			number=number/10;
		}
		return orignal==duplicate;
		
	}
	int palinDromNumber1(int number) {
		int orignal=number;
		int duplicate=0;
		while (number>0) {
			int digit=number%10;
			duplicate=duplicate*10+digit; //1
			number=number/10;
		}
		 if (orignal==duplicate) {
			System.out.println("This number is palindrom number");
		}else {
			System.out.println("Not Palindrom number");
		};
		return duplicate;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for check palindrom number :");
		int number=scanner.nextInt();
		Palindromnumber p=new Palindromnumber();
		p.palinDromNumber1(number);
	
		if (p.palinDromNumber(number)) {
			System.out.println("This number is palindrom number");
		}else {
			System.out.println("Not Palindrom number");
		}
	}

}
