package Static;

public class InstanceInStatic {
   
        static int staticVar1 = 10;
        static int staticVar2 = 20;
    
        int instanceVar1 = 30;
        int instanceVar2 = 40;
    
        public static void staticMethod1() {
            MyClass obj = new MyClass(); // Create an instance to access instance variables
            System.out.println("Instance variables in static method: " + obj.instanceVar1 + ", " + obj.instanceVar2);
        }
    
        public static void main(String[] args) {
            staticMethod1();
        }
    }
        
