package Static;

public class MyClass {
    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Static methods
    public static void staticMethod1() {
        System.out.println("This is static method 1");
    }

    public static void staticMethod2() {
        System.out.println("This is static method 2");
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("This is instance method 1");
    }

    public void instanceMethod2() {
        System.out.println("This is instance method 2");
    }

    // Main method
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Create an instance of MyClass
        System.out.println("Static variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
        
        // Call static methods
        staticMethod1();
        staticMethod2();
        
        // Call instance methods
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
