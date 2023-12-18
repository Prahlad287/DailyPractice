package com.map.interface1;

import java.nio.channels.NonWritableChannelException;
import java.util.Collection;
import java.util.HashMap;

public class MapAddExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		map1.put("Six", 6);
		map1.putAll(map);
		
		map.forEach((key,val)->System.out.println(key+" : "+val));
		System.out.println("-----------------------------------");
		map1.forEach((key,val)->System.out.println(key+" : "+val));
		
		System.out.println(map.putIfAbsent("one", 111));
		System.out.println(map.putIfAbsent("Five", 5));
		System.out.println("-----------------------------------");

		map.forEach((key,val)->System.out.println(key+" : "+val));
		
		System.out.println(map.get("Two"));
		
		System.out.println(map.containsKey("Seven"));
		System.out.println(map.containsValue(300));
//		Collection<String> collection=map.keySet();
//		for (String string : collection) {
//			System.out.println(string);
//		}
		map.computeIfPresent("one",(key, value)-> 45);
		System.out.println(map);

	}

}
