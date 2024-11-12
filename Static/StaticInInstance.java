package Static;

public class StaticInInstance {
    
        static int staticVar1 = 10;
        static int staticVar2 = 20;
    
        public void instanceMethod1() {
            System.out.println("Static variables in instance method: " + staticVar1 + ", " + staticVar2);
        }
    
        public static void main(String[] args) {
            MyClass obj = new MyClass();
            obj.instanceMethod1();
        }
    }
       

