package AccessModifiers;

class E extends D {
    public void accessProtectedFromChildClass() {
        // Accessing protected members from the parent class D
        System.out.println("Protected field from parent class: " + protectedField);
        protectedMethod();
    }

    public static void main(String[] args) {
        E objE = new E();
        objE.accessProtectedFromChildClass();  // Accessing protected members in subclass
    }
}

