package com.collections;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("First");
		list.add("second");
		list.stream().forEach(System.out::println);
		// there are iterator use for print next element
		Iterator<String> it=list.iterator();
		
		list.stream().forEach(System.out::println);
//		it.remove();
		
		//add string and sorting by collection.sort method 
		List<String> list2=new ArrayList<String>(list);
		list2.add("first");
		list2.add("Third");
		list2.add("zbc");
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println("sorting :"+list2);
		
		//sorting using arraylist add number and sort
		Integer number[]= {8,6,4,3,1,2,9};
		List<Integer> list3=new ArrayList<Integer>();
		list3.addAll(Arrays.asList(number));
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);

	}

}
