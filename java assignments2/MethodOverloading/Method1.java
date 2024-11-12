package MethodOverloading;


    class MethodOverloading1 {

        // Method with one integer parameter
        public void display(int a) {
            System.out.println("Method with 1 integer parameter: " + a);
        }
    
        // Method with two integer parameters
        public void display(int a, int b) {
            System.out.println("Method with 2 integer parameters: " + a + ", " + b);
        }
    
        public static void main(String[] args) {
            MethodOverloading1 obj = new MethodOverloading1();
            obj.display(10);       // Calls method with 1 parameter
            obj.display(10, 20);   // Calls method with 2 parameters
        }
    }
      

