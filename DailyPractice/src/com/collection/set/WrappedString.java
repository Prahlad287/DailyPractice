package com.collection.set;

import java.util.HashSet;

public class WrappedString {
	private String s;
	public WrappedString(String s) {
		this.s=s;
	}
	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		WrappedString ws1=new WrappedString("Prahlad");
		WrappedString ws2=new WrappedString("Prahlad");
		String s1=new String("Prahlad");
		String s2=new String("Prahlad");
		hs.add(ws1);
		hs.add(ws2);
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs.size());
		
		
		
		Integer x=0;
		Integer y=0;
		for (Short z= 0; z <5; z++) {
	
			if ((++x>2)||(++y >2)) {
				x++;
				System.out.println(x+" : "+y);
			}
		}


	}

}
