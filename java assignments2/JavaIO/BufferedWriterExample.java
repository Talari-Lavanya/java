package JavaIO;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String text = "Writing text using BufferedWriter.";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputBufferedWriter.txt"))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

