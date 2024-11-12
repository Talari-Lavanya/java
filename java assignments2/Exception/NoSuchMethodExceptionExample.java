package Exception;

import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Method method = cls.getDeclaredMethod("nonExistentMethod");  // NoSuchMethodException
        } catch (NoSuchMethodException e) {
            System.out.println("No such method: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

