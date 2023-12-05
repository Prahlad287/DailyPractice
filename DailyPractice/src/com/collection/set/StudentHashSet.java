package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentHashSet {

	public static void main(String[] args) {
		AddressStudent ad=new AddressStudent("Sikar", "Rajasthan");
		AddressStudent ad1=new AddressStudent("pali", "up");
		Student s1=new Student(287, "Prahlad", ad);
		Student s2=new Student(295, "Ajay",ad1);
		
		HashSet hs1=new HashSet();
		hs1.add(s1);
		System.out.println(hs1);
		
		ArrayList list=new ArrayList();
		list.add(s2);
		HashSet hs2 = new HashSet(list);	        
	    System.out.println(hs2);
		
		ArrayList list1=new ArrayList(s2);	
		HashSet hs3 = new HashSet(list1);	        
	    System.out.println(hs3);
		
	}

}
