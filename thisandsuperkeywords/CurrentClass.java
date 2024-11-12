package thisandsuperkeywords;

class CurrentClass {
    int a = 10;
    String b = "Hello";

    public void printFields() {
        System.out.println("a: " + this.a);
        System.out.println("b: " + this.b);
    }

    public static void main(String[] args) {
        CurrentClass instance = new CurrentClass();
        instance.printFields();
    }
}

