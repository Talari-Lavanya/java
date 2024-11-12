package AbstractClass;

class Car extends Vehicle {
    // Provide implementation for the abstract method
    void startEngine() {
        System.out.println("Car engine started.");
    }

    public static void main(String[] args) {
        // Creating an instance of the abstract class using the child class
        Vehicle vehicle = new Car();
        
        // Accessing the non-abstract method
        vehicle.stopEngine();
    }
}


