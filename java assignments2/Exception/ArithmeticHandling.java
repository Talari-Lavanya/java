package Exception;

public class ArithmeticHandling {
    
        public static void main(String[] args) {
            try {
                int result = 10 / 2; // Will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }
    

