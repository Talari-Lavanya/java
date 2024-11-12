// 4. Create a class with PUBLIC fields and methods. 
//Access the public methods and fields from any class in the same package or different 
//package

// Class with Public Fields and Methods
// Class with Public Fields and Methods


package AccessModifiers;

class G {
    public int publicField = 40;  // Public field
    public void publicMethod() {  // Public method
        System.out.println("Public method in class G");
    }

    public static void main(String[] args) {
        G obj = new G();
        // Accessing public field and method within the same package
        System.out.println("Public field: " + obj.publicField);
        obj.publicMethod();
    }
}

