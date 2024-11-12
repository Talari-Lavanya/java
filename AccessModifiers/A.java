// 1. Create a class with PRIVATE fields, private method and a main method. Print the fields 
// in main method. Call the private method in main method.
// Create a sub class and try to access the private fields and methods from sub class.

//  Class with Private Fields, Private Method, and Accessing in Main Method
// Class with Private Fields and Methods

package AccessModifiers;

public class A {
    
        private int privateField = 10;  // Private field
        private void privateMethod() {  // Private method
            System.out.println("Private method in class A");
        }
    
        public void displayPrivate() {
            // Accessing private fields and methods within the class
            System.out.println("Private field: " + privateField);
            privateMethod();
        }
    
        public static void main(String[] args) {
            A obj = new A();
            // Accessing private fields and methods from the main method using the public method
            obj.displayPrivate();
        }
    }
     

