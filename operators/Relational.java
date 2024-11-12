package operators;

public class Relational {
  
        public void compareValues(int a, int b) {
            System.out.println("a < b: " + (a < b));
            System.out.println("a <= b: " + (a <= b));
            System.out.println("a > b: " + (a > b));
            System.out.println("a >= b: " + (a >= b));
        }
    
        public static void main(String[] args) {
            Relational obj = new Relational();
            obj.compareValues(10, 20);
        }
    }
    

