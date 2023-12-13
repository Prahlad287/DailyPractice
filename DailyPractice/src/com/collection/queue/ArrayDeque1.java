package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;

import com.collection.set.AddressStudent;

public class ArrayDeque1 {

	public static void main(String[] args) {
		int arr[]= {50,90,30,70,30,80,32};
		
		ArrayDeque ad1=new ArrayDeque();
		System.out.println(ad1.pollLast());
		for (int i : arr) {
			ad1.add(i);
		}
		
		Spliterator spliterator=ad1.spliterator();
		spliterator.forEachRemaining(System.out::println);
		
		Object[] arr1 = ad1.toArray();
		Arrays.sort(arr1);
		System.out.println("The array is:"); 
        for (int j = 0; j < arr1.length; j++) 
            System.out.print(arr1[j]+" "); 	
	}
}
