package AccessModifiers;

  // Importing the class from another package

class H {
    public static void main(String[] args) {
        G objG = new G();
        // Accessing public field and method from a different package
        System.out.println("Public field from class G: " + objG.publicField);
        objG.publicMethod();
    }
}

