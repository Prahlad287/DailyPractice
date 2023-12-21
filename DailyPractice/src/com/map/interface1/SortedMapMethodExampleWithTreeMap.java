package com.map.interface1;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethodExampleWithTreeMap {

	public static void main(String[] args) {
		SortedMap map=new TreeMap();
		map.put(20, "Prahlad");
		map.put(40, "Ray");
		map.put(60, "Ajay");
		map.put(10, "Ram");
		System.out.println(map.values());//values
		System.out.println(map.comparator());
		System.out.println(map.entrySet());
		System.out.println(map.firstKey());
		System.out.println(map.headMap(60));
		System.out.println(map.keySet());
		System.out.println(map.lastKey());
		System.out.println(map.subMap(20, 60));
		System.out.println(map.tailMap(20));
		System.out.println(map.values());
		
		map.forEach((key,val)->System.out.println(key+" "+val));
		

	}

}
