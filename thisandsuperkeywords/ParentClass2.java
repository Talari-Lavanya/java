package thisandsuperkeywords;

class ParentClass {
    int x = 30;

    public void displayX() {
        System.out.println("Parent x: " + x);
    }
}

class ChildClass extends ParentClass {
    int x = 40;

    public void display() {
        System.out.println("Child x using this.x: " + this.x);
        System.out.println("Parent x using super.x: " + super.x);
    }

    public static void main(String[] args) {
        ChildClass instance = new ChildClass();
        instance.display();
    }
}
