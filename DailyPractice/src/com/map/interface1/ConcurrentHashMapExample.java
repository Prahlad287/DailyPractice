package com.map.interface1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	static void concurrenthashmapExample() throws InterruptedException {
		ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
		map.put(10, 200);
		map.put(20, 200);
		map.put(10, 5000);

		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {

			ConcurrentHashMap.Entry entry = (ConcurrentHashMap.Entry) iterator.next();
			Object key = entry.getKey();
			Object value = entry.getValue();

			System.out.println("Key: " + key + ", Value: " + value);
			Thread.sleep(1000);

			// Modifying the map concurrently
			map.put("Hello", 200);
			map.put("Hello", 400);
			map.put("Prahlad", 1000);
		}

		System.out.println(map);
	}

	public static void main(String[] args) throws InterruptedException {
	//	concurrenthashmapExample();
		Hashtable map = new Hashtable();
		map.put(10, 200);
		map.put(20, 200);
		map.put(10, 5000);

		

			// Modifying the map concurrently
			map.put("Hello", 200);
			map.put("Hello", 400);
			map.put("Prahlad", 1000);
		

		System.out.println(map);

	}

}
