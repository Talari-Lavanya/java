//2. Print the fields/instance members of the parent class using super


package thisandsuperkeywords;

class ParentClass {
    int x = 20;
    String y = "World";
}

class ChildClass extends ParentClass {
    public void printParentFields() {
        System.out.println("x: " + super.x);
        System.out.println("y: " + super.y);
    }

    public static void main(String[] args) {
        ChildClass instance = new ChildClass();
        instance.printParentFields();
    }
}
