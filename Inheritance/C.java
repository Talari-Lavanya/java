package Inheritance;

class C extends B {
    int dataC = 30;  // Data member for class C

    // Specific method for class C
    public void methodC1() {
        System.out.println("Method C1 from class C");
    }

    // Specific method for class C
    public void methodC2() {
        System.out.println("Method C2 from class C");
    }

    // Overridden method in class C
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class C");
    }
}
