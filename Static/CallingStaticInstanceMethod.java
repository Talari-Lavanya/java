package Static;

public class CallingStaticInstanceMethod {
    
        static int staticVar1 = 10;
        static int staticVar2 = 20;
    
        int instanceVar1 = 30;
        int instanceVar2 = 40;
    
        public static void staticMethod1() {
            System.out.println("This is static method 1");
        }
    
        public static void staticMethod2() {
            System.out.println("This is static method 2");
        }
    
        public void instanceMethod1() {
            System.out.println("This is instance method 1");
        }
    
        public void instanceMethod2() {
            System.out.println("This is instance method 2");
        }
    
        public static void main(String[] args) {
            MyClass obj = new MyClass(); // Create an instance to call instance methods
    
            // Call static methods
            staticMethod1();
            staticMethod2();
    
            // Call instance methods
            obj.instanceMethod1();
            obj.instanceMethod2();
        }
    }
    

