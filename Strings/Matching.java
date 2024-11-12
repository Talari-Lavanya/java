package Strings;

public class Matching {
 
        public static void main(String[] args) {
            String str = "Hello123";
    
            // Checking if the string matches a pattern
            boolean matches = str.matches(".*\\d.*");
    
            System.out.println("Matches regex for containing a number: " + matches);
        }
    }
       

