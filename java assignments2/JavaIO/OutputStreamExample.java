package JavaIO;

import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        String text = "Hello, this is a test!";
        try (OutputStream outputStream = new FileOutputStream("output.txt")) {
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}


