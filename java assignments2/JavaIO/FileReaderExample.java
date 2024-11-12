package JavaIO;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("example.txt")) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

