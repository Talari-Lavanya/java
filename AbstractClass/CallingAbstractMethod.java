package AbstractClass;

class Car extends Vehicle {
    // Implementing the abstract method
    void startEngine() {
        System.out.println("Car engine started.");
    }

    public static void main(String[] args) {
        // Creating an instance of the child class
        Car myCar = new Car();
        
        // Calling the abstract method
        myCar.startEngine();
    }
}
