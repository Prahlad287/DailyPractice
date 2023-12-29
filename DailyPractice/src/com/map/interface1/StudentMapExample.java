package com.map.interface1;

import java.nio.channels.NonWritableChannelException;
import java.util.HashMap;
import java.util.Map;

class Student{
	int id; 
	String name;
	String college;
	public Student(int id, String name, String college) {
		
		this.id = id;
		this.name = name;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}
public class StudentMapExample {

	public static void main(String[] args) {
		Student s1=new Student(287, "Prahlad", "Sikar");
		Student s2=new Student(295, "Ajay", "Pali");
		Student s3=new Student(587, "Ram", "Jaipur");
		Student s4=new Student(587, "Ram", "Jaipur");
		
		HashMap<Integer, Object> map=new HashMap();
		map.put(1, s1);
		map.put(2, s2);
		map.put(2, s3);
		map.put(null, s4);
		//System.out.println(map);
		
		map.forEach((key,val)->System.out.println(key+" : "+val));
		System.out.println();
		System.out.println("*****************Add object in key******************");
		HashMap map1=new HashMap();
		map1.put(s1, 1);
		map1.put(s2, 2);
		map1.put(s3, 3);
		map1.put(s4, 5);
		//System.out.println(map);
		map1.forEach((key,val)->System.out.println(key+" : "+val));
		
		
	}

}
