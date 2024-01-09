package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer=new BufferedWriter(new FileWriter("Abc.txt"));
		writer.write("Hello My name is Prahlad",17,7);
		writer.newLine();
		writer.write(new char[] {'j','a','v','a'});
		
		writer.close();
		
		BufferedReader reader=new BufferedReader(new FileReader("Abc.txt"));
		int i=reader.read();
		while (i!=-1) {
			System.out.print((char) i);
			i=reader.read();
		}

	}

}
