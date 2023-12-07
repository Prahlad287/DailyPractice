package com.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
	
		SortedSet<Integer> set2=new TreeSet<Integer>();
		set2.add(600);
		
		
		TreeSet set=new TreeSet(set2);
		
		
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
		
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.descendingSet());
		System.out.println(set);
		System.out.println(set.ceiling(30));
		System.out.println(set.floor(10));
		System.out.println(set.headSet(30));
		set.add(10);
		set.add(50);
		System.out.println("**********************");
		System.out.println(set.tailSet(10));
		System.out.println(set.headSet(50));
		//System.out.println(set.pollLast());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.headSet(30));
		
		

		        // Creating a tree set with a customized comparator
		       TreeSet<String> animals = new TreeSet<>(new CustomComparator());
				
		        animals.add("Dog");
		        animals.add("Zebra");
		        animals.add("Cat");
		        animals.add("Horse");
		        System.out.println("TreeSet: " + animals);
		    // Creating a comparator class
		
				Comparator<String> comparator=Comparator.reverseOrder();
				TreeSet set3=new TreeSet(comparator);
				set3.add("prg");
				set3.add("arg");
				set3.add("hia");
				System.out.println(set3);
				

	}
	 public static class CustomComparator implements Comparator<String> {

	        @Override
	        public int compare(String animal1, String animal2) {
	        	System.out.println(animal1);
	        	System.out.println(animal2);
	            int value =  animal1.compareTo(animal2);
	           
	            // elements are sorted in reverse order
	            if (value > 0) {
	            	 System.out.println(value);
	                return 1;
	            }
	            else if (value < 0) {
	            	 System.out.println(value);
	                return -1;
	            }
	            else {
	            	 System.out.println(value);
	                return 0;
	            }
	        }
	    }

}
