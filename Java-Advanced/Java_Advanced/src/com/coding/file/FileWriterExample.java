package com.coding.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        // Creating FileWriter object
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is to test the File Write concept in Java.");
            for(int i = 0; i<10000; i++) {
                writer.write("*");
            }
            writer.flush();
            System.out.println("Successfully written to the file.");
        } catch (IOException exception) {
            System.out.printf("An error occured. %s \n", exception.getMessage());
        }
    }
}
