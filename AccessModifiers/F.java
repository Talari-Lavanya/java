package AccessModifiers;

 // Importing the class from another package

class F {
    public static void main(String[] args) {
        D objD = new D();
        // Cannot access protected members here because F is not a subclass of D
        // This will result in a compile-time error
        // System.out.println(objD.protectedField);  // Error
        // objD.protectedMethod();  // Error
    }
}

