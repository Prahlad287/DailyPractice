package com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_interface_practice {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("Prahlad");
		set.add("Ray");
		set.add("Gurjar");
		
		System.out.println(set);
		
		Set<String> set2=new TreeSet();
		set2.add("toy");
		set2.add("abc");
		set2.add("hello");
		set2.add("Prahlad");
		set2.add("Ray");
		set2.add("Gurjar");
		
		
		System.out.println(set2);
		
		// Finding Union of set1 and set2   
		Integer []object={5,4,31,2,78,2,1,31,78};
		Integer []object1={55,44,31,22,78,2,1,31,788};
		Set<Integer> set3=new TreeSet();
		set3.addAll(Arrays.asList(object));
		System.out.println("Sorted set of numbers: " + set3);
		Set<Integer> set4=new TreeSet<Integer>();
		set4.addAll(Arrays.asList(object1));
		System.out.println("Sorted set of numbers: " + set4);
		Set<Integer>	set5=new TreeSet<Integer>(set3);
		set5.addAll(set4);
		System.out.println(set5);

	    // Finding Intersection of set1 and set2   mins same number both are 
		Set<Integer> intersection=new TreeSet<Integer>(set3);
		intersection.retainAll(set4);
		System.out.println(intersection);
		
		 // Finding Difference of set1 and set2    
		Set<Integer> diffrence=new TreeSet<Integer>(set4);
		diffrence.removeAll(set3);
		System.out.println(diffrence);
	}

}
