package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Creating objects of classes A, B, and C
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling methods from class A
        objA.methodA1();
        objA.methodA2();
        objA.overriddenMethod();  // Calls method from class A

        // Calling methods from class B
        objB.methodB1();
        objB.methodB2();
        objB.overriddenMethod();  // Calls method from class B

        // Calling methods from class C
        objC.methodC1();
        objC.methodC2();
        objC.overriddenMethod();  // Calls method from class C

        // Runtime Polymorphism with superclass reference
        A refB = new B();
        A refC = new C();

        // Calling overridden methods using superclass references
        refB.overriddenMethod();  // Calls method from class B
        refC.overriddenMethod();  // Calls method from class C
    }
}
