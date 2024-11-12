package Exception;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomException1 {
    public static void main(String[] args) throws MyCustomException {
        throw new MyCustomException("This is my custom exception.");
    }
}

