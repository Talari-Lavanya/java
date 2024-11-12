class MyClass {
    int x;
    String y;

    // Default constructor
    public MyClass() {
        System.out.println("Default Constructor called");
        x = 0;
        y = "Default";
    }

    // One-argument constructor
    public MyClass(int x) {
        this.x = x;
        System.out.println("One-argument Constructor called with x: " + x);
    }

    // Two-argument constructor
    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
        System.out.println("Two-argument Constructor called with x: " + x + ", y: " + y);
    }
}

public class MainClass {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();              // Calls default constructor
        MyClass obj2 = new MyClass(10);            // Calls one-argument constructor
        MyClass obj3 = new MyClass(20, "Hello");   // Calls two-argument constructor
    }
}
