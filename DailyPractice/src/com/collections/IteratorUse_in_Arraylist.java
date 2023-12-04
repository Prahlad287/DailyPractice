package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.event.ListSelectionEvent;

public class IteratorUse_in_Arraylist {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(60);
		list.add(100);
		list.add(60);

		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			Integer integer = (Integer) itrIterator.next();
			if (integer == 100) {
				itrIterator.remove();
			}
			System.out.println(integer);
		}
		System.out.println("********************************************************************************");
		System.out.println(list);
		itrIterator.forEachRemaining(num -> System.out.println(num));

		itrIterator.forEachRemaining(System.out::println);
		list.add(200);
		System.out.println("**************************************************************************");
		ListIterator<Integer> list1 = list.listIterator();
		while (list1.hasNext()) {
			Integer integer = (Integer) list1.next();
			System.out.println(integer);
		}
		System.out.println("**************************************************************************");
		while (list1.hasPrevious()) {
			Integer integer = (Integer) list1.previous();
			System.out.println(integer);
		}
	}
}
