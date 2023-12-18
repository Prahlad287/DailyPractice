package com.map.interface1;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMethodsAll {

	public static void main(String[] args) {
		Map<Integer,String> p=new HashMap();
//		p.put(12, "prahld");
//		p.put("Ray", 287);
//		p.put(500, 500);
//		p.put(3.3f, 7.0);
//		p.put(null, null);
//		p.put(null, 200);
		
		p.put(5, "prg");
		p.put(10, "ol");
		p.put(2, "Hello");
		p.put(50, "prg");
		p.put(12, "ol");
		p.put(25, "Hello");
		
		Map<Integer,String> p1=new HashMap();
		p1.putAll(p);
		System.out.println(p.containsKey(5));
		System.out.println(p.containsValue("Hello"));
		HashSet set=new HashSet(p.entrySet());
		System.out.println(set);
		System.out.println(p.equals(p1));
		System.out.println(p.get(50));
		System.out.println(p.getOrDefault(25, "hello"));
		System.out.println(p.hashCode());
		System.out.println(p.isEmpty());
		System.out.println(p.keySet());
		System.out.println(p.values());
		System.out.println(p.putIfAbsent(13, "Thirteen"));
		System.out.println(p.remove(13));
		System.out.println(p.remove(50, "prg"));
		System.out.println(p.replace(2, "not Hello"));
		System.out.println(p.replace(2, "not Hello","prg"));
		System.out.println(p.size());
		System.out.println(p.put(10000, "JI"));
		 for (Map.Entry<Integer,String> entry : p.entrySet()) {
	            System.out.println("key: "+entry.getKey());
	            System.out.println(entry.getValue());
	        }
		
		System.out.println("**********************************");
		
		p.forEach((key, value) -> System.out.println(key + ": " + value));
	    
		Set set2=p.entrySet();
		System.out.println("Print set2 :"+set2);
		System.out.println("Print by iterator");
		Iterator itr=set2.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry) itr.next();
			System.out.println("Key is "+entry.getKey()+" ----> value is "+entry.getValue());
			
		}
		for (Map.Entry<Integer, String> entry : p.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key is "+key+" value is "+val);
			
		}
		Collection<String> collection=p.values();
		for (String string : collection) {
			System.out.println(string);
		}

	}

}
