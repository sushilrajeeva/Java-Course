package com.coding.file;

import com.coding.helper.UserInput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = UserInput.userInput("Enter the filename");

        try (FileReader fileReader = new FileReader(fileName)) {

            int read = 0;
            do {
                read = fileReader.read();
                System.out.print((char) read);
            } while (read != -1);

        } catch (FileNotFoundException e) {
            System.out.println("The file you are trying to read doesn't exist...");
        }
        catch (IOException ioException) {
            System.out.printf("Exception occured %s \n", ioException.getMessage());
        }
    }
}
