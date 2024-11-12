// Subclass Trying to Access Private Fields and Methods

package AccessModifiers;

class B extends A {
    public void accessPrivateFromSubClass() {
        // Cannot access privateField or privateMethod directly here
        // This will result in a compile-time error
        // System.out.println(privateField);  // Error
        // privateMethod();  // Error
    }
    
    public static void main(String[] args) {
        B objB = new B();
        objB.accessPrivateFromSubClass();  // Trying to access private fields/methods
    }
}
