package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class LetterSort {

	public static void main(String[] args) {
		ArrayList<String> s2=new ArrayList<String>();
		s2.add("aa");
		s2.add("a");
		s2.add("AAA");
		s2.add("AAAA");
		Collections.sort(s2);
		for (String string : s2) {
			System.out.println(string);
		}

	}

}
