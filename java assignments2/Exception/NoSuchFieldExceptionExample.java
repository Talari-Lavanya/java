package Exception;

import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Field field = cls.getDeclaredField("nonExistentField");  // NoSuchFieldException
        } catch (NoSuchFieldException e) {
            System.out.println("No such field: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

