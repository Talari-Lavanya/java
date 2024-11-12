package JavaIO;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String text = "Buffered Output Stream Example!";
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("outputBuffered.txt"))) {
            bufferedOutputStream.write(text.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

