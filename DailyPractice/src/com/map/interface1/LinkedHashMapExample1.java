package com.map.interface1;

import java.util.LinkedHashMap;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		map.put("one", "Red");
		map.put("two", "Green");
		map.put("three", "Blue");
		
		System.out.println("Origanal LinakedHashMap :"+map);
		System.out.println("LinakedHashMap isEmplty? :"+map.isEmpty());
		System.out.println("Size of the map :"+map.size());
		System.out.println("value of the Key='one' :"+map.get("one"));
		System.out.println("value of the Key='one' :"+map.containsKey("two"));
		System.out.println("value of the Values='ree' :"+map.containsValue("ree"));
		System.out.println("Delete element 'one': "+map.remove("one"));
		System.out.println("Update map :"+map);


	}

}
