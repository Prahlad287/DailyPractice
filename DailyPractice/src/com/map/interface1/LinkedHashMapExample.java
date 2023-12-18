package com.map.interface1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample extends LinkedHashMap<Integer, String> {

    private static final int MAX_ENTRIES = 5;

    public static void main(String[] args) {
        LinkedHashMapExample map = new LinkedHashMapExample(20, 0.40f, false);
        map.put(40, "Avca");
        map.put(60, "BCd");
        map.put(80, "cd");
        map.put(140, "Hello");
        map.put(610, "za");
        map.put(801, "Why");

        LinkedHashMap<Integer, String> p = new LinkedHashMap<>();
        p.put(5, "prg");
        p.put(10, "o1");
        p.put(2, "Hello");
        p.put(3, "Why");
        p.put(4, "Ji");

        System.out.println("Before replaceAll:");
        map.forEach((key, val) -> System.out.println(key + " : " + val));

        // Replace values in map with values from p
   //     map.replaceAll((key, val) -> p);
        map.replaceAll((key, val) -> p.containsKey(key) ? p.get(key) : val);

        System.out.println("\nAfter replaceAll:");
        map.forEach((key, val) -> System.out.println(key + " : " + val));
    }

    public LinkedHashMapExample(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
    	
        return size() > MAX_ENTRIES;
    }
}
