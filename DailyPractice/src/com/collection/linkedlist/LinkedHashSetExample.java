package com.collection.linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		HashSet set=new LinkedHashSet();
		set.add(10);
		set.add("prg");
		set.add(10);
		set.add(20);
		System.out.println("**************** Print by Object****************");
		System.out.println(set);
		System.out.println("**************** Print by forEach loop lambda method****************");
		set.forEach(System.out::println);
		System.out.println("**************** Print by Iterator****************");
		Iterator itr = set.iterator();  
		itr.forEachRemaining(System.out::println);
		System.out.println("**************Print by spliterator *******************");
		 Spliterator splitr = set.spliterator();  
		 splitr.forEachRemaining(System.out::println);
		 
		 System.out.println("**************** Print by for loop****************");
		 

		 
		
		
	}

}
