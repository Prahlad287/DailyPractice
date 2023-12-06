package com.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(20);
		set.add(10);
		set.add(5);
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		set.add(40);
		set.add(23);
		System.out.println(set);
		System.out.println(set.subSet(10, 23));
		System.out.println(set.headSet(20));
		System.out.println(set.tailSet(20));
		System.out.println(set.headSet(20, false));
		System.out.println(set);
		set.add(20);
		System.out.println(set.ceiling(20));
		System.out.println(set.floor(10));
		System.out.println(set.higher(20));
		System.out.println(set.lower(5));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
	//	System.out.println(set.descendingSet());
		
		System.out.println("***********************");
		Iterator itr=set.descendingIterator();
		itr.forEachRemaining(System.out::println);
		
		System.out.println(set.comparator());
		
//		System.out.println(set.pollFirst());
//		System.out.println(set.pollLast());
//		System.out.println(set.descendingSet());
	}

}
