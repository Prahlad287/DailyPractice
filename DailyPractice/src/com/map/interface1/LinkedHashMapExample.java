package com.map.interface1;

import java.awt.Button;
import java.security.AlgorithmConstraints;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;

import com.inheritence.instanceof1.Animal;

public class LinkedHashMapExample extends LinkedHashMap<Integer, Object> {

    private static final int MAX_ENTRIES = 3;

    public static void main(String[] args) {
    	Al as1=new Al(){
    		static void show() {
    			System.out.println("This is display method");
    		}
    	};
    	Al.show();
//    	as1.display();
    	
    	
    	
    	
        LinkedHashMapExample map = new LinkedHashMapExample(20, 0.40f, false);
        map.put(40, 200);
        map.put(60, 300);
        map.put(80, 100);
        map.put(140, 200);
        map.put(610, 300);
        map.put(801, 100);
        // ...

        LinkedHashMap p = new LinkedHashMap<>();
        p.put(5, "prg");
        p.put(10, "ol");
        p.put(2, "Hello");
//        p.put(50, "prg");
//        p.put(12, "ol");
//        p.put(25, "Hello");

  //      System.out.println("Before replaceAll:");
     //   map.forEach((key, val) -> System.out.println(key + " : " + val));

        map.replaceAll((key, val) -> p);
    //    map.replaceAll((key, val) -> p.get(key));
 //       System.out.println("\nAfter replaceAll:");
 //       map.forEach((key, val) -> System.out.println(key + " : " + val));
       
    }

    public LinkedHashMapExample(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Object> eldest) {
        return size() > 3;
    }
}