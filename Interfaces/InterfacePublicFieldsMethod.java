package Interfaces;

public interface InterfacePublicFieldsMethod {
    // All fields are public, static, and final by default
    int NUM = 111; // Value assigned

    // Abstract method to be implemented by the class
    void myMethod();
}

// Class implementing the interface
class Jala_08 implements InterfacePublicFieldsMethod {
    @Override
    public void myMethod() {
        System.out.println("This is a method from the InterfacePublicFieldsMethod interface.");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of Jala_08
        Jala_08 j = new Jala_08();

        // Printing the values of the interface fields
        System.out.println(InterfacePublicFieldsMethod.NUM); // Accessing the interface field directly by interface name

        // Calling the interface method
        j.myMethod();
    }
}