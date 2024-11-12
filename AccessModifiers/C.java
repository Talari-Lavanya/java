//2. Create a class with DEFAULT fields and methods. Access these fields and methods 
//from any other class in the same package

// Class with Default Fields and Methods
// Class with Default Fields and Methods


package AccessModifiers;

class C {
    int defaultField = 20;  // Default access modifier field
    void defaultMethod() {  // Default access modifier method
        System.out.println("Default method in class C");
    }

    public static void main(String[] args) {
        C obj = new C();
        // Accessing default field and method in the same package
        System.out.println("Default field: " + obj.defaultField);
        obj.defaultMethod();
    }
}
