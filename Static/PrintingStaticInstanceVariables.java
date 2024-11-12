package Static;

public class PrintingStaticInstanceVariables {
   
        static int staticVar1 = 10;
        static int staticVar2 = 20;
    
        int instanceVar1 = 30;
        int instanceVar2 = 40;
    
        public static void main(String[] args) {
            MyClass obj = new MyClass(); // Create an instance to access instance variables
    
            // Print static variables
            System.out.println("Static variables: " + staticVar1 + ", " + staticVar2);
            
            // Print instance variables
            System.out.println("Instance variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
        }
    }
       

