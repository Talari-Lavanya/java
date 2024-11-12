package operators;

public class Logical {

        public void logicalOperations(boolean x, boolean y) {
            System.out.println("x AND y: " + (x && y));
            System.out.println("x OR y: " + (x || y));
            System.out.println("NOT x: " + (!x));
        }
    
        public static void main(String[] args) {
            Logical obj = new Logical();
            obj.logicalOperations(true, false);
        }
    }
    

