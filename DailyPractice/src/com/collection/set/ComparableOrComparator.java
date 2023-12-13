package com.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Abc implements Comparable<Abc> {
    int id;
    String name;

    public Abc(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Abc [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Abc o) {
        return Integer.compare(this.id, o.id);
    }
}

class SortingById implements Comparator<Abc> {
    @Override
    public int compare(Abc o1, Abc o2) {
        return Integer.compare(o1.id, o2.id);
    }
}

class SortingByName implements Comparator<Abc> {
    @Override
    public int compare(Abc o1, Abc o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class ComparableOrComparator {

    public static void main(String[] args) {
        List<Abc> abcList = new ArrayList<>();

        // Creating Abc objects
        Abc abc1 = new Abc(10, "John");
        Abc abc2 = new Abc(5, "Alice");
        Abc abc3 = new Abc(20, "Bob");

        // Adding objects to the list
        abcList.add(abc1);
        abcList.add(abc2);
        abcList.add(abc3);

        // Sorting using Comparable (by Id)
        Collections.sort(abcList);
        System.out.println("Sorted by Id (using Comparable):");
        abcList.forEach(System.out::println);

        // Sorting using Comparator (by Name)
        Collections.sort(abcList, new SortingByName());
        System.out.println("Sorted by Name (using Comparator):");
        abcList.forEach(System.out::println);
    }
}
