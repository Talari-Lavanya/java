package MethodOverloading;

class MethodOverloading4 {

    // Method with one integer parameter
    public void display(int a) {
        System.out.println("Method with integer parameter: " + a);
    }

    // Method with one double parameter
    public void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading4 obj = new MethodOverloading4();
        obj.display(10);        // Calls method with integer parameter
        obj.display(10.5);      // Calls method with double parameter
    }
}
