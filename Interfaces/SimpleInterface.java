package Interfaces;



// Step 1: Define the interface with a single method
interface SimpleInterface {
    void showMessage();
}

// Step 2: Implement the interface in a class
class SimpleClass implements SimpleInterface {
    // Provide implementation for the interface method
    public void showMessage() {
        System.out.println("This is the implementation of showMessage from SimpleInterface.");
    }



    public static void main(String[] args) {
        // Step 3: Use an interface instance to call the implemented method
        SimpleInterface obj = new SimpleClass(); // Interface reference pointing to SimpleClass instance
        obj.showMessage(); // Calls the showMessage method from SimpleClass
    }

}