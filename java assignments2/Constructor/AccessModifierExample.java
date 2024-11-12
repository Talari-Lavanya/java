class AccessModifiersExample {

    // Public constructor
    public AccessModifiersExample() {
        System.out.println("Public Constructor called");
    }

    // Private constructor
    private AccessModifiersExample(int x) {
        System.out.println("Private Constructor called with x: " + x);
    }

    // Protected constructor
    protected AccessModifiersExample(String y) {
        System.out.println("Protected Constructor called with y: " + y);
    }

    // Default (package-private) constructor
    AccessModifiersExample(int x, String y) {
        System.out.println("Default Constructor called with x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        AccessModifiersExample obj1 = new AccessModifiersExample();
        AccessModifiersExample obj2 = new AccessModifiersExample("Hello");
        AccessModifiersExample obj3 = new AccessModifiersExample(10, "Hello");

        // Private constructor can only be called within the same class
        AccessModifiersExample obj4 = new AccessModifiersExample(5);
    }
}
