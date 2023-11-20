package com.constructor.chaining;

public class Constructorchaining {
	int Id;
	String Name;
	
	
	public Constructorchaining(int id,String name) {
		System.out.println("Constructor object");
		Id=id;
		Name=name;
	}
	public Constructorchaining(Constructorchaining c) {
		 Id = c.Id;
	        Name = c.Name;
	}
	void display() {
		System.out.println("Id : "+ Id);
		System.out.println("Name :"+ Name);
	}

	public static void main(String[] args) {
		Constructorchaining cc=new Constructorchaining(287,"Prahlad");
		Constructorchaining cc2=new Constructorchaining(cc);
		cc.display();
		cc2.display();

	}

}
