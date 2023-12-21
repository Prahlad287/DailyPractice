package com.map.interface1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

class Stu {
    Integer id;
    String name;
    String address;

    public Stu(int id, String name, String address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

class SortingByid implements Comparator<Stu> {
    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.id - o2.id;
    }
}

class SortingByname implements Comparator<Stu> {
    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortingByaddress implements Comparator<Stu> {
    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.address.compareTo(o2.address);
    }
}

public class SortingCustomInTreeMap {
    public static void main(String[] args) {
        ArrayList<Stu> studentList = new ArrayList<>();
        studentList.add(new Stu(1, "Prahlad", "Bajor"));
        studentList.add(new Stu(3, "Ram", "Sikar"));
        studentList.add(new Stu(2, "Ajay", "Pali"));
        Stu stu = new Stu(10, "Avinash", "Ranoli");
        Stu stu1 = new Stu(20, "Chandan", "Jaipur");
        Stu stu2 = new Stu(10, "Ram", "Jaipur");
        studentList.add(stu);
        studentList.add(stu1);
        studentList.add(stu2);
        TreeMap<Stu, String> mapById = new TreeMap(new SortingByid());
//        mapById.put(stu, stu.name + " ;" + stu.address);
//        mapById.put(stu1, stu1.name + " ;" + stu1.address);
//        mapById.put(stu2, stu2.name + " ;" + stu2.address);

        for (Stu student : studentList) {
            mapById.put(student, student.name+" : "+student.address);
        }

        System.out.println("Sorted by ID:");
        mapById.forEach((key, val) -> System.out.println(key.id + " : " + val));

        TreeMap<Stu, String> mapByName = new TreeMap<>(new SortingByname());
        for (Stu student : studentList) {
            mapByName.put(student, student.name+" : "+student.address);
        }

        System.out.println("\nSorted by Name:");
        mapByName.forEach((key, val) -> System.out.println(key.id + " : " + val));

        TreeMap<Stu, String> mapByAddress = new TreeMap<>(new SortingByaddress());
        for (Stu student : studentList) {
            mapByAddress.put(student, student.name+" : "+student.address);
        }

        System.out.println("\nSorted by Address:");
        mapByAddress.forEach((key, val) -> System.out.println(key.id + " : " + val));
    }
}
