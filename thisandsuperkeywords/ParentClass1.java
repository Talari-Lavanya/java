package thisandsuperkeywords;



class ParentClass {
    int x;
    String y;

    public ParentClass() {
        this.x = 15;
        this.y = "Parent";
    }
}

class ChildClass extends ParentClass {
    int z;

    public ChildClass() {
        super();
        this.z = 25;
    }

    public void display() {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    public static void main(String[] args) {
        ChildClass instance = new ChildClass();
        instance.display();
    }
}
