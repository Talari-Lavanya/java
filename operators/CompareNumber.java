package operators;

public class CompareNumber {
    
        public void checkEqual(int a, int b) {
            if (a == b) {
                System.out.println("The numbers are equal.");
            } else {
                System.out.println("The numbers are not equal.");
            }
        }
    
        public static void main(String[] args) {
            CompareNumber obj = new CompareNumber();
            obj.checkEqual(10, 10);
        }
    }
     

