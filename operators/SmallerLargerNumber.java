package operators;


    public class SmallerLargerNumber {
        public void findSmallerLarger(int a, int b) {
            if (a < b) {
                System.out.println("Smaller: " + a);
                System.out.println("Larger: " + b);
            } else if (a > b) {
                System.out.println("Smaller: " + b);
                System.out.println("Larger: " + a);
            } else {
                System.out.println("Both numbers are equal.");
            }
        }
    
        public static void main(String[] args) {
            SmallerLargerNumber obj = new SmallerLargerNumber();
            obj.findSmallerLarger(15, 10);
        }
    }
      

