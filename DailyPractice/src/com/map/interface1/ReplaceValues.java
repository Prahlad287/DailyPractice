package com.map.interface1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class ReplaceValues {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Z");
		list.add("A");
		list.add("M");
		list.add("K");
		list.add("a");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "12"));
		System.out.println(Collections.binarySearch(list, "7"));
		System.out.println(Collections.binarySearch(list, "6"));
		System.out.println(Collections.binarySearch(list, "5"));
		System.out.println(Collections.binarySearch(list, "L"));
		
		
		System.out.println("-------------------question 2-----------------------");

		HashMap hm= new HashMap();
		hm.put("ONE", "AAA");
		hm.put("TWO", "BBB");
		hm.put("THREE", "CCC");
		hm.put("FOUR", "DDD");
		hm.put("FIVE", "EEE");

		System.out.println(hm);
		System.out.println(hm.replace("FOUR", "DDD", 444));
		System.out.println(hm);
	}

}
