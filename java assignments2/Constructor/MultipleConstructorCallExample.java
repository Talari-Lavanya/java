class MultipleConstructorCallExample {
    int x;

    // Constructor
    public MultipleConstructorCallExample(int x) {
        this.x = x;
        System.out.println("Constructor called with x: " + x);
    }

    public static void main(String[] args) {
        // Simulating multiple constructor calls by creating multiple objects
        MultipleConstructorCallExample obj1 = new MultipleConstructorCallExample(10);
        MultipleConstructorCallExample obj2 = new MultipleConstructorCallExample(20);
        MultipleConstructorCallExample obj3 = new MultipleConstructorCallExample(30);
    }
}

