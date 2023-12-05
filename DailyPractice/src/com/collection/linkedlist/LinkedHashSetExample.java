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
		
		System.out.println(set);
	//	set.forEach(System.out::println);
		
		
		 Spliterator splitr = set.spliterator();  
		 splitr.forEachRemaining(System.out::println);
		
		
	}

}
