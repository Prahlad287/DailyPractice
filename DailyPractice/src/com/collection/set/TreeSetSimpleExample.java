package com.collection.set;

import java.util.TreeSet;

public class TreeSetSimpleExample {

	public static void main(String[] args) {
		// create a TreeSet to store names in alphabetical order
		TreeSet<String> name=new TreeSet<String>();
		// add name in treeSet
		name.add("Prahlad");
		name.add("Avinash");
		name.add("Azad");
		name.add("Meghraj");
		name.add("Chandan");
		// display origanal treeset
		name.forEach(System.out::println);
		// add duplicate name
		name.add("Prahlad");
		// print after add duplicate name
		System.out.println(name);
		// remove name one
		name.remove("Azad");
		System.out.println(name);
		
		for (String string : name) {
			System.out.println(string);
		}
		// print first
		System.out.println("*********Print first************");
		System.out.println(name.first());
		System.out.println("**********Print last***********");
		System.out.println(name.last());
		System.out.println("**********Print SubSet********");
		System.out.println(name.subSet("Avinash", "Prahlad"));
	}

}
