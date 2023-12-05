package com.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Student extends ArrayList<Student>{
	int Id;
	String Name;
	AddressStudent address;
	public Student(int id, String name, AddressStudent address) {
		super();
		this.Id = id;
		this.Name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", address=" + address + "]";
	}
	

}
