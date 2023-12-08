package com.practice.string;

import java.util.Arrays;

public class FindAnagram {

	public static void main(String[] args) {
		String word="cook";
		String second="kooc";
		char []c=word.toCharArray();
		Arrays.sort(c);
		char []d=second.toCharArray();
		Arrays.sort(d);

		if (String.valueOf(c).equals(String.valueOf(d))) {
			System.out.println("Anagram String");
		}else {
			System.out.println("NOt Anagram");
		}

	}

}
