package com.collections;

import java.util.ArrayList;

public class Arraylist_double {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(20);
		list.add("prg");
		list.add(20.000);
		list.add("@#");
		ArrayList<Double> dou=new ArrayList<Double>(list);
		
		dou.add(55.05);
		dou.add(100.20);
		
		System.out.println(dou);
		
		ArrayList<Double> list1=new ArrayList<Double>(dou);
		list1.add(66.66);
		list1.add(99.699);
		System.out.println(list1);
		list1.ensureCapacity(6);
		System.out.println(list1.indexOf(20));
		System.out.println(list1.size());
		
	}

}
