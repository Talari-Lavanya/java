package MethodOverloading;



class MethodOverloading5 {

    // Method with integer return type and integer parameter
    public int display(int a) {
        return a;
    }

    // Overloaded method with double return type and double parameter
    public double display(double a) {
        return a + 0.5;
    }

    public static void main(String[] args) {
        MethodOverloading5 obj = new MethodOverloading5();
        System.out.println(obj.display(10));      // Calls display(int a)
        System.out.println(obj.display(10.0));    // Calls display(double a)
    }
}


