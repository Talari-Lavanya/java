package Inheritance;

class B extends A {
    int dataB = 20;  // Data member for class B

    // Specific method for class B
    public void methodB1() {
        System.out.println("Method B1 from class B");
    }

    // Specific method for class B
    public void methodB2() {
        System.out.println("Method B2 from class B");
    }

    // Overridden method in class B
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class B");
    }
}
