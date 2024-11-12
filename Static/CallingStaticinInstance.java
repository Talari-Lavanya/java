package Static;

public class CallingStaticinInstance {
   
        public static void staticMethod1() {
            System.out.println("Static method 1 called from instance method");
        }
    
        public void instanceMethod1() {
            staticMethod1(); // Directly call static method in instance method
        }
    
        public static void main(String[] args) {
            MyClass obj = new MyClass();
            obj.instanceMethod1();
        }
    }
       

