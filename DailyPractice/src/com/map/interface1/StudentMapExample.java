package com.map.interface1;

import java.nio.channels.NonWritableChannelException;
import java.util.HashMap;
import java.util.Map;

class Student{
	int id; 
	String name;
	String college;
	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
	
}
public class StudentMapExample {

	public static void main(String[] args) {
		Student s1=new Student(287, "Prahlad", "Sikar");
		Student s2=new Student(295, "Ajay", "Pali");
		Student s3=new Student(587, "Ram", "Jaipur");
		Student s4=new Student(0, "Ram", "Jaipur");
		
		HashMap map=new HashMap();
		map.put(1, s1);
		map.put(2, s2);
		map.put(2, s3);
		map.put(null, s4);
		//System.out.println(map);
		
		map.forEach((key,val)->System.out.println(key+" : "+val));

	}

}
