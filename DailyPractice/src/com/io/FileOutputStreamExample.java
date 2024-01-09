package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSOutputStream;
import org.bouncycastle.asn1.crmf.EncKeyWithID;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		FileOutputStream out1=null;
		try {
			out1=new FileOutputStream("D:\\Io\\FileOutputStream.txt",true);
			out1.write(100);
			byte []b=new byte[]{65,66,67,68};
			out1.write(10);
			String word="This is a output Stream";
			
			out1.write(b);
			
			byte b2[]=word.getBytes();
			out1.write(10);
			out1.write(b2);
			
		
			
			
			
			
			
		FileInputStream	out2=new FileInputStream("D:\\Io\\FileOutputStream.txt");
			int i=out2.read();
			while (i!=-1) {
				System.out.print((char) i);
			
				i=out2.read();
			//	System.out.println(out2.available());
			
			}
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
