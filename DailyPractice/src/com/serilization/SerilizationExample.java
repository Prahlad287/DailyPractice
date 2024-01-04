package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerilizationExample implements Serializable {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialization
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Serialization.txt"));
        Scanner scanner=new Scanner(System.in);
        String dataToSerialize =scanner.nextLine();
        outputStream.writeUTF(dataToSerialize);
        outputStream.close(); 
        
        // Deserialization
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Serialization.txt"));
        String deserializedString = (String) inputStream.readUTF();
        inputStream.close(); // 

        System.out.println("Deserialized String: " + deserializedString);
    }
}
