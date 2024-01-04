package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDFWithPdfWriter {
	public static void createPdf(String filePath) throws FileNotFoundException, DocumentException {
		Document document=new Document();
		 PdfWriter.getInstance(document, new FileOutputStream(filePath));
		 System.out.println("Pdf created Successfully :"+filePath);
		 document.open();
		 document.add(new Paragraph("What is your name "));
		 document.close();
	}

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
			createPdf("D:\\Io\\CreatePdf.pdf");

	}
}