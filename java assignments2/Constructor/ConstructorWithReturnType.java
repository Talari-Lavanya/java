class ConstructorWithReturnType {

    // Incorrect usage - this is a method, not a constructor
    public int ConstructorWithReturnType() {
        System.out.println("This is not a constructor; it's a method returning int.");
        return 0;
    }

    // Another incorrect usage - this is a method, not a constructor
    public String ConstructorWithReturnType(String str) {
        System.out.println("This is not a constructor; it's a method returning String.");
        return str;
    }

    public static void main(String[] args) {
        ConstructorWithReturnType obj = new ConstructorWithReturnType();
        obj.ConstructorWithReturnType();
        obj.ConstructorWithReturnType("Hello");
    }
}
