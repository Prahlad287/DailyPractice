package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetConstructor {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Prahlad");
		list1.add("Ray");
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(10);
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.add(90);
		list3.add(80);

		HashSet hs1=new HashSet(list2);
		//hs1.add(list1);
		//hs1.add(list2);
		//hs1.add(list3);
		
		System.out.println(hs1);
		System.out.println(hs1.size());
		System.out.println("***********************************");
		
		HashSet hs2=new HashSet(hs1);
		System.out.println(hs2);
		System.out.println("*************check size hs2***********");
		System.out.println(hs2.size());
		
		HashSet hs3=new HashSet(list1);	
		HashSet<Integer> hs4=new HashSet(list2);
		System.out.println("*************did not accept duplicate value***************");
		System.out.println(hs4);
		System.out.println(hs4.size());
		
		System.out.println(hs4.addAll(hs3));
		System.out.println(hs4);
		
	}

}
