package com.collections;

import java.util.Vector;

public class VectorExamples {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(255);
		vector.add(20);
		System.out.println(vector);
		System.out.println(vector.capacity());
		vector.ensureCapacity(20);
		System.out.println(vector.size());
		System.out.println(vector.capacity());

	}

}
