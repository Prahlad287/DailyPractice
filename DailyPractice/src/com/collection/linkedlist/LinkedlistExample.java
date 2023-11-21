package com.collection.linkedlist;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class LinkedlistExample {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println(list instanceof Iterable<Integer>);
		
		list.add(500);
		list.add(100);
		System.out.println(list);
		list.add(1, 150);
		System.out.println(list);
		list.addFirst(300);
		System.out.println(list);
		list.addLast(1000);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println("*******************************************");
		LinkedList<Integer> list2=new LinkedList<Integer>(list);
		list2.addFirst(25);
		list2.add(50);
		list2.forEach(System.out::println);
		System.out.println("***********  after remove list first	*****************");

	//	list2.removeAll(list);
		list2.forEach(System.out::println);
		System.out.println(list2.indexOf(list2));
		list2.forEach(System.out::println);
		System.out.println(list2.size());
		System.out.println("check");
		
		


	}

}
