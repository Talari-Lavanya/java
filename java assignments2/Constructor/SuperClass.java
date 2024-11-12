class SuperClass {
    int a;

    // Default constructor
    public SuperClass() {
        System.out.println("Superclass Default Constructor called");
        a = 0;
    }

    // Argument constructor
    public SuperClass(int a) {
        this.a = a;
        System.out.println("Superclass Argument Constructor called with a: " + a);
    }
}

class SubClass extends SuperClass {
    int b;

    // Child class constructor calling superclass default constructor
    public SubClass() {
        super(); // Calls the default constructor of SuperClass
        System.out.println("Subclass Default Constructor called");
        b = 0;
    }

    // Child class constructor calling superclass argument constructor
    public SubClass(int a, int b) {
        super(a); // Calls the argument constructor of SuperClass
        this.b = b;
        System.out.println("Subclass Argument Constructor called with b: " + b);
    }

    public static void main(String[] args) {
        SubClass obj1 = new SubClass();           // Calls default constructors
        SubClass obj2 = new SubClass(10, 20);     // Calls argument constructors
    }
}
