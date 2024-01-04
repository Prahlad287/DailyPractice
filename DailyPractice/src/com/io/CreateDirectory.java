package com.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CreateDirectory {

	public static void main(String[] args) throws IOException {
		String string="C:\\Users\\DELL\\git\\repository\\DailyPractice\\com.io";
		File file=new File(string);
		
		file.mkdir();
		
		File file2=new File(string,"Abc.txt");
		if (file2.exists()) {
			System.out.println("Already exits file");
		}else {
			file2.createNewFile();
			System.out.println("File successfully created");
		}
		
		File file3=new File(string,"Xyz.txt");
		if (file3.exists()) {
			System.out.println("Already exits file");
		}else {
			file3.createNewFile();
			System.out.println("File successfully created");
		}
		
		System.out.println(file2.getAbsolutePath());
		
		File file4=new File("D:\\JAVA\\abc","xx.txt");
		System.out.println(file4.getParentFile().mkdir());
		System.out.println(file4.createNewFile());
		System.out.println(file4.exists());
		
		  String filePath = "C:\\Users\\DELL\\git\\repository\\DailyPractice\\com.io\\Abc.txt";
		 try {
			 List<String> lines = Files.readAllLines(Paths.get(filePath));
	            for (String line : lines) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		 try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
	            lines.forEach(System.out::println);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		 
	}

}
