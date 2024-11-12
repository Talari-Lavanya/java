// 3. Create a class with PROTECTED fields and methods. Access these fields and methods 
//from any other class in the same package.  give the souce codes and dont use pre defined functions  
//Also, Access the PROTECTED fields and methods from child class located in a different 
//package
//Access the PROTECTED fields and methods from any class in different package

// Class with Protected Fields and Methods
// Class with Protected Fields and Methods


package AccessModifiers;

class D {
    protected int protectedField = 30;  // Protected field
    protected void protectedMethod() {  // Protected method
        System.out.println("Protected method in class D");
    }

    public static void main(String[] args) {
        D obj = new D();
        // Accessing protected field and method within the same package
        System.out.println("Protected field: " + obj.protectedField);
        obj.protectedMethod();
    }
}

