package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IoPractice {
	static void fileCreate() throws IOException {
		File file=new File("SaveData.txt");
		System.out.println(file.mkdir());
		if (file.exists()) {
			System.out.println("File already Exits.");
		}
		else {
			file.createNewFile(); 
				System.out.println("File created successfully");
		} 
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		
		
	}

	static void filewriter(String name) throws IOException {
		FileWriter fileWriter=new FileWriter("SaveData.txt",true);
		fileWriter.append(name);
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SaveData.txt"));
       
        outputStream.writeUTF(name);
        outputStream.close(); 
		fileWriter.close();
	}
	static String fileReading() throws IOException {
		FileReader fileReader=new FileReader("SaveData.txt");
		Scanner readScanner=new Scanner(fileReader);
		StringBuffer  read=new StringBuffer();
		 while (readScanner.hasNext()) {
	            read.append(readScanner.nextLine()).append(System.lineSeparator());
	        }
		 ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SaveData.txt"));
	        String deserializedString = (String) inputStream.readUTF();
	        inputStream.close(); // 

	        System.out.println("Deserialized String: " + deserializedString);
		 fileReader.close();
		 
		return read.toString();
	}
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		
		fileCreate();
		System.out.println("Enter word to store in the file...");
		String word=scanner.nextLine();
		filewriter(word+" ");
		
		String read=fileReading();
		 System.out.println("Content read from file: " + read);
		 
		 File file=new File("SaveData.txt");
		 boolean deleted = file.delete();
		 if (deleted) {
		     System.out.println("File deleted successfully.");
		 } else {
		     System.out.println("Unable to delete the file. Check for possible reasons.");
		     System.out.println("File exists: " + file.exists());
		     System.out.println("Is file a directory: " + file.isDirectory());
		     System.out.println("Can execute: " + file.canExecute());
		     System.out.println("Can write: " + file.canWrite());
		 }
		 int i=System.in.read();//returns ASCII code of 1st character  
		 System.out.println((char)i);
	}

}
