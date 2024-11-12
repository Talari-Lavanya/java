package Exception;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            throw new IOException("This is an I/O Exception.");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

