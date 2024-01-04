package com.io;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreatePdfByFileWriter {

    public static void main(String[] args) {
    	 // Create a PDF file
        createPDF("D:\\Io\\MyPDFFile.pdf");
        // Specify the path to the existing PDF file
        String existingPDFPath = "D:\\Io\\MyPDFFile.pdf";

        // Append text to the existing PDF file
    //    appendTextToPDF(existingPDFPath);

        // Read and print the modified PDF file
        readPDFContent(existingPDFPath);
    }
    
    private static void createPDF(String filePath) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                
                // First line of text
                contentStream.beginText();
                contentStream.newLineAtOffset(100, 700);
                contentStream.showText("Hello, this is my PDF file created with Apache PDFBox.");
                contentStream.endText();
            

                // Second line of text
                contentStream.beginText();
                contentStream.newLineAtOffset(100, 680);
                contentStream.showText("And created by Mr Prahlad Ray Gurjar  Hello");
                contentStream.endText();
            }

            // Save the document
            document.save(new File(filePath));
            System.out.println("PDF file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void appendTextToPDF(String filePath) {
        try (PDDocument document = PDDocument.load(new File(filePath))) {
            // Iterate over each page in the document
            for (PDPage page : document.getPages()) {
                // Create a new content stream for each page in append mode
                try (PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true)) {
                    // Set the font for the text
                    contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

                    // Move to the desired position
                    contentStream.beginText();
                    contentStream.newLineAtOffset(100, 700);

                    // Add the text to the content stream
                //    contentStream.showText("This is an appended text.");

                    // End the text block
                    contentStream.endText();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // Save the modified document
            document.save(filePath);
            System.out.println("Text appended to the existing PDF successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readPDFContent(String filePath) {
        try (PDDocument document = PDDocument.load(new File(filePath))) {
            // Create a PDFTextStripper
            PDFTextStripper pdfTextStripper = new PDFTextStripper();

            // Iterate over each page and extract text
            for (int i = 0; i < document.getNumberOfPages(); i++) {
                pdfTextStripper.setStartPage(i + 1);
                pdfTextStripper.setEndPage(i + 1);

                // Get the text content of the page
                String text = pdfTextStripper.getText(document);

                // Print the text content of the page
                System.out.println("Page " + (i + 1) + ":\n" + text.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
