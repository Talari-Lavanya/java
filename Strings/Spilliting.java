package Strings;

public class Spilliting {
    
        public static void main(String[] args) {
            String str = "Apple,Banana,Cherry";
    
            // Splitting the string by comma
            String[] fruits = str.split(",");
    
            // Displaying the result
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }
       

