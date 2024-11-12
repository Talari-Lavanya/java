package MethodOverloading;


    class MethodOverloading2 {

        // Method with one integer parameter
        public void display(int a) {
            System.out.println("Method with 1 integer parameter: " + a);
        }
    
        // Method with one String parameter
        public void display(String a) {
            System.out.println("Method with 1 String parameter: " + a);
        }
    
        public static void main(String[] args) {
            MethodOverloading2 obj = new MethodOverloading2();
            obj.display(10);         // Calls method with integer parameter
            obj.display("Hello");    // Calls method with String parameter
        }
    }
      

