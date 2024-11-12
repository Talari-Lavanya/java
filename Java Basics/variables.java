public class variables {
   
        static int number = 100;
    
        public static void main(String[] args) {
            int number = 50; 
            System.out.println("Local variable: " + number);
            System.out.println("Global variable: " + variables.number);
        }
    }
    

