package Exception;

public class ThrowException {
    
        public static void methodThatThrows() throws Exception {
            throw new Exception("This is an exception thrown by method.");
        }
    
        public static void main(String[] args) throws Exception {
            methodThatThrows();  // No try-catch block here, so it will propagate
        }
    }
    

