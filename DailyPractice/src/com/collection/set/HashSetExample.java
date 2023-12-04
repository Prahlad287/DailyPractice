package com.collection.set;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hSet=new HashSet();
		//hetrogenius
		hSet.add(10);
		hSet.add(20);
		hSet.add(null);
		hSet.add(null);
		
		System.out.println(hSet);
		System.out.println(hSet.add(10)); // return false if values present in the map
		System.out.println(hSet.add(null));// same up
		System.out.println(hSet.add(5));// return true if value not present in the map
		
		Iterator itr=hSet.iterator();
		itr.forEachRemaining(System.out::println);
		
		hSet.add(30);
		System.out.println(hSet);
		itr.forEachRemaining(num-> System.out.println(num));
	}

}
