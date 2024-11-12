package Strings;

public class Comparing {
    
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "hello";
            String str3 = "Hello, World!";
    
            // Using equals() to compare
            System.out.println("Using equals: " + str1.equals(str2));
    
            // Using equalsIgnoreCase() to compare ignoring case
            System.out.println("Using equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
    
            // Using startsWith() to check if the string starts with the given prefix
            System.out.println("Using startsWith: " + str3.startsWith("Hello"));
    
            // Using endsWith() to check if the string ends with the given suffix
            System.out.println("Using endsWith: " + str3.endsWith("World!"));
    
            // Using compareTo() to compare strings lexicographically
            System.out.println("Using compareTo: " + str1.compareTo(str2));
        }
    }
      

