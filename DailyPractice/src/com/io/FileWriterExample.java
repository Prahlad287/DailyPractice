package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Io","Abc.txt");
		f.getParentFile().mkdir();
		System.out.println(f.getAbsolutePath());
		f.createNewFile();
		System.out.println(f.exists());
		FileWriter fWriter=new FileWriter("D:\\Io\\NewFile.txt",true);
		fWriter.write("Hello my name is prahlad");
		fWriter.write("Hello my name is avinash");
		fWriter.write('x');
		fWriter.write(65);
		fWriter.flush();
		fWriter.close();
		
		FileWriter fWriter2=new FileWriter("D:\\Io\\My.pdf",true);
		fWriter2.write("This is my pdf file");
		
		fWriter2.close();
		
		
		
		
		
		 File pdfFile = new File("D:\\Io\\My.pdf");

	        // Create the file and parent directories if they don't exist
	        pdfFile.getParentFile().mkdirs();
	        pdfFile.createNewFile();

	        // Write text content to the file
	        try (FileWriter fileWriter = new FileWriter(pdfFile, true)) {
	            fileWriter.write("This is my non-PDF file with a .pdf extension.");
	            fileWriter.write(System.lineSeparator());
	            fileWriter.write("It is just a text file, not a valid PDF file.");
	        }

	        // Print the absolute path of the created text file
	        System.out.println(pdfFile.getAbsolutePath());
	        
	        
	        
	        
	        File pdfFile2 = new File("D:\\Io\\My.pdf");

	        // Check if the file exists before attempting to read
	        if (pdfFile.exists()) {
	            try (FileReader fileReader = new FileReader(pdfFile);
	                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

	                String line;
	                while ((line = bufferedReader.readLine()) != null) {
	                    System.out.println(line);
	                }

	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.out.println("File does not exist: " + pdfFile.getAbsolutePath());
	        }
		
	}

}
