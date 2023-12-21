package com.map.interface1;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapMethodExample {

	public static void main(String[] args) {
		NavigableMap map=new TreeMap();
		map.put(40, "Prahlad");
		map.put(20, "Ray");
		map.put(60, "Ajay");
		map.put(10, "Ram");
		System.out.println(map.ceilingKey(11));
		System.out.println(map.floorKey(61));
		System.out.println(map.higherKey(10));
		System.out.println(map.lowerKey(60));
		System.out.println(map.ceilingEntry(21));
		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());
		System.out.println(map.firstEntry());
		System.out.println(map.floorEntry(1));
		System.out.println(map.headMap(40));
		System.out.println(map.headMap(40, true));
		System.out.println(map.higherKey(20));
		System.out.println(map.lastEntry());
		System.out.println(map.lowerEntry(25));
		System.out.println(map.navigableKeySet());
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		System.out.println();
		map.put(10, "Ram");
		map.put(60, "Ajay");
		System.out.println(map.tailMap(40, false));
		System.out.println(map.tailMap(40));
		System.out.println();
		map.forEach((key,val)->System.out.println(key+" "+val));

	}

}
