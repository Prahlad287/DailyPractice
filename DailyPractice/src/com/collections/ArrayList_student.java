package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_student {

	public static void main(String[] args) {
		Student student=new Student(287,"Prahlad","English");
		Student student1=new Student(295,"Ajay","computer");
//		student.setname("Prahlad");
//		student.setid(287);
//		student.setSub("Hindi");
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(student);
		al.add(student1);
		for (Student student2 : al) {
			System.out.println(student2);
		}
		Iterator it=al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}
