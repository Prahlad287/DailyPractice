package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class FindHashcode {
	public static void main(String[] args) {
		HashSet<Integer> hSet=new HashSet();
		
		hSet.add(10);
		hSet.add(22);
		hSet.add(33);
		hSet.add(44);
		hSet.add(55);
		
		int mod=10;
		for (Integer integer : hSet) {
			System.out.println(integer.hashCode());
			int hash=integer.hashCode()%mod;
			System.out.println("Number : "+integer+" Hash : "+hash);
		}
		
	}
}
