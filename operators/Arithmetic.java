package operators;

public class Arithmetic {
   
        public void performArithmetic(int a, int b) {
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));
        }
    
        public static void main(String[] args) {
            Arithmetic obj = new Arithmetic();
            obj.performArithmetic(10, 5);
        }
    }
    
