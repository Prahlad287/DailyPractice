package com.collection.set;

import java.nio.channels.NonWritableChannelException;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student1 implements Comparable<Student1> {
	int id;
	String name;
	public Student1(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
 //	@Override
//	public int compare(Student1 o1, Student1 o2) {
//		 int value =  o1.compareTo(o2);
//         
//         // elements are sorted in reverse order
//         if (value > 0) {
//         	 
//             return 1;
//         }
//         else if (value < 0) {
//         	 
//             return -1;
//         }
//         else {
//         	 
//             return 0;
//		
//	}
//}
	public int compareTo(Student1 o2) {
		Student1 s=(Student1) o2;
//		if (this.id>s.id) {
//			 return 1;
//		}else if (this.id < s.id) {
//         	 
//             return -1;
//         }
//         else { 
//             return 0;
//         }
		char []first=new char[this.name.length()];
		char []last=new char[s.name.length()];
		this.name=this.name.toUpperCase();
		first=this.name.toCharArray();
		last=s.name.toCharArray();
		for (int i = 0; i < s.name.length(); i++) {
			if (first[i]>last[i]) {
			
				return 1;
			}else if (first[i]<last[i]) {
				return -1;
			}
		}
		return 0;		
		
	}
	 @Override
	public String toString() {
		
		return id+" "+name;
	}
	 public Student1() {
	}
}
public class TreeComaparatorExample {

	public static void main(String[] args) {
		Student1 s1=new Student1(287, "Prahlad");
		Student1 s2=new Student1(295, "Ajay");
		Student1 s3=new Student1(100, "Vijay");
		Student1 s4=new Student1(600, "Rajesh");
		Student1 s5=new Student1(899, "ramesh");
		
		
		TreeSet set=new TreeSet();
		set.add(s2);
		set.add(s1);
		set.add(s3);
		set.add(s4);
		set.add(s5);

		set.forEach(System.out::println);
	}
}
