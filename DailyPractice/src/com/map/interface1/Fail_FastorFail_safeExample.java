package com.map.interface1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Fail_FastorFail_safeExample {
	static void Fail_Fast() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
		    String element = iterator.next();
		     list.add("C"); 
		    System.out.println(element);
		}
	}

	public static void main(String[] args) {
	//
		Fail_Fast();
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
		    String element = iterator.next();
		    list.add("C");
		    System.out.println(element);
		}
	}
}
