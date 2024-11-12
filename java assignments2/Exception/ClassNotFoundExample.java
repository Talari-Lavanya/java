package Exception;

public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass");  // Will throw ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
