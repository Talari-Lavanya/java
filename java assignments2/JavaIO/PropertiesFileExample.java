package JavaIO;

import java.io.*;
import java.util.*;

public class PropertiesFileExample {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(fileInputStream);

            String value = properties.getProperty("key");
            System.out.println("Value for 'key': " + value);
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}

