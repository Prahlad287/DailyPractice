package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(null);
		list.add(20);
		list.add(null);
		list.add(10);
		
		
	
		// print first for list
		System.out.println("by list***********************************************");
		System.out.println(list);
		//print second forEach
		System.out.println("by foreach***********************************************");

		for (Integer integer : list) {
			System.out.println(integer);
		}
		//print third iterator
		System.out.println("by Iteretor***********************************************");

		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("by for loop***********************************************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("by lambda***********************************************");
		list.forEach(System.out::println);
		System.out.println("by stream***********************************************");
		list.stream().forEach(System.out::println);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(50);
		list1.add(200);
		list1.addAll(1,list);
		System.out.println(list1);
	}

}
