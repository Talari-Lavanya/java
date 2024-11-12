package JavaIO;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {
        String text = "Writing text using FileWriter.";
        try (FileWriter fileWriter = new FileWriter("outputFileWriter.txt")) {
            fileWriter.write(text);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
