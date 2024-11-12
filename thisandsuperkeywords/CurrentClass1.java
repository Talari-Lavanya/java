//3. Call constructor of the current class using this()

package thisandsuperkeywords;



class CurrentClass {
    int a;
    String b;

    public CurrentClass() {
        this(10, "Hello");
    }

    public CurrentClass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        CurrentClass instance = new CurrentClass();
        instance.display();
    }
}
