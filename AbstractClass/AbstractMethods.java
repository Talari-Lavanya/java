package AbstractClass;

abstract class Vehicle {
    // Abstract method (doesn't have a body)
    abstract void startEngine();

    // Non-abstract method
    void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}

