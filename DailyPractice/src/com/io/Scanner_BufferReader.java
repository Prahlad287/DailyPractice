package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner_BufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b2=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id");
		int id=Integer.parseInt(b2.readLine());
		System.out.println("Enter name");
		String name=b2.readLine();
		System.out.println(id+" "+name);

	}

}
