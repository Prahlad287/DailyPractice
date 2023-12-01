package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array_two_d {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<Integer> lists=new ArrayList<Integer>();
		System.out.println("Enter array row");
		int rowArray=scanner.nextInt();
		for (int i = 0; i < rowArray; i++) {
			System.out.println("Enter column");
			int column=scanner.nextInt();
			ArrayList<Integer> list2=new ArrayList();
			for (int j = 0; j < column; j++) {
				list2.add(scanner.nextInt());
			}
			lists.addAll(list2);
		}
		System.out.println("Enter searching quries");
		int numberofqures=scanner.nextInt();
		for (int i = 0; i <numberofqures; i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			
			 try {
	                System.out.println(lists.get(x - 1)+lists.get(y - 1));
	            } catch (IndexOutOfBoundsException e) {
	                System.out.println("ERROR!");
	            }
		}
		
		
	}

}
