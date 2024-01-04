package com.io;

import java.io.File;
import java.io.IOException;

public class MethodDifference {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\JAVA\\Difference", "abc.txt");
        file.getParentFile().mkdirs(); // mkdirs() creates parent directories if they don't exist
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Canonical Path: " + file.getCanonicalPath());
        System.out.println("Path: " + file.getPath());

        // Rename the file
        File renamedFile = new File(file.getParent(), "xyz.txt");
        boolean success = file.renameTo(renamedFile);

        if (success) {
            System.out.println("File renamed successfully");
            System.out.println("New Path: " + renamedFile.getAbsolutePath());
        } else {
            System.out.println("File renaming failed");
        }
    }
}
