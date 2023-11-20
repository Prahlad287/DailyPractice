package com.collections;

public class Student {
	private int id;
	private String name;
	private String sub;
	
	
public Student(int id, String name, String sub) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
	}


//	public void setid(int id) {
//		this.id=id;
//	}
//	public void setname(String name) {
//		this.name=name;
//	}
//	public void setSub(String sub) {
//		this.sub = sub;
//	}
//	public int getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}public String getSub() {
//		return sub;
//	}
	@Override
	public String toString() {
		
		return " Id ="+id +" Name =" + name +" Subject ="+sub;
	}

}
