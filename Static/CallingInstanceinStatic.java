package Static;

public class CallingInstanceinStatic {
   
        public void instanceMethod1() {
            System.out.println("Instance method 1 called from static method");
        }
    
        public static void staticMethod1() {
            MyClass obj = new MyClass(); // Create an instance to call instance method
            obj.instanceMethod1();
        }
    
        public static void main(String[] args) {
            staticMethod1();
        }
    }
       

