package operators;

public class EqualNotEqual {
  
        public void checkEquality(int a, int b) {
            System.out.println("a == b: " + (a == b));
            System.out.println("a != b: " + (a != b));
        }
    
        public static void main(String[] args) {
            EqualNotEqual obj = new EqualNotEqual();
            obj.checkEquality(10, 20);
        }
    }
      

