package operators;


    public class IncrementDecrement {
        public void incrementDecrement(int a) {
            System.out.println("Original: " + a);
            System.out.println("After Increment: " + (++a));
            System.out.println("After Decrement: " + (--a));
        }
    
        public static void main(String[] args) {
            IncrementDecrement obj = new IncrementDecrement();
            obj.incrementDecrement(10);
        }
    }
    

