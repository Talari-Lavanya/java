package Exception;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "abc";
        int num = Integer.parseInt(str);  // NumberFormatException
    }
}

