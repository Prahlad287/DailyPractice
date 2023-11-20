package com.example.anytime;

import java.beans.JavaBean;

@JavaBean
public class Example_anytime {
	
	int a;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prahlad";
	}

	public static void main(String[] args) {
		Example_anytime e1=new Example_anytime();
		System.out.println(e1);
		System.out.println(e1.toString());
		if (System.out.printf("Hello world")==null) {
			
		}
		if (System.out.append("Hello world")==null) {
			
		}
		if (System.out.append("Hello world").equals(null)) {
			
		}

	}

}
