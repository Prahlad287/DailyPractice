package com.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationUsess {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(60);
		list.add(100);
		list.add(60);
		Vector<Integer> vector=new Vector<Integer>(list);
		
		Enumeration<Integer> enumeration=vector.elements();
		while (enumeration.hasMoreElements()) {
			Integer integer = (Integer) enumeration.nextElement();
			System.out.println(integer);
		}
		
	}
}
