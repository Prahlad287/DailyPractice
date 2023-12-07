package com.practice.string;

import java.util.ArrayList;

public class SplitString {

	public static void main(String[] args) {
		int count=0;
		String str="Hello how are you. I am fine what. about you ?";
		
		int first=0,last=0;
		
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==' '||str.charAt(i)=='.')	
			{				
				last=i;
				System.out.println(last);
				System.out.println(str.substring(first,last));
				list.add(str.substring(first,last));
				first=last+1;
				count++;
				
			}
			
			if(i==str.length()-1)
			{
				last=str.length();
				System.out.println(str.substring(first,last));
				list.add(str.substring(first,last));
			}
			
			
		}
		System.out.println(list);
		String[] array = list.toArray(new String[0]);
		System.out.println(String.join(" ",array));

	}

}
