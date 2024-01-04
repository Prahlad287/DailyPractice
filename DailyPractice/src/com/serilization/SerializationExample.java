package com.serilization;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        
        try {
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serializedData.dat"));

            Person person = new Person("Prahlad Ray  Doe", 25);
            objectOutputStream.writeObject(person);

          
            System.out.println("Data serialized and saved in byte stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and read data from byte stream
        try {
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serializedData.dat")); 

            Person deserializedPerson = (Person) objectInputStream.readObject();
            System.out.println("Data deserialized: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

