package multiple_inheritance;

/**
 * This is the example of multiple inheritance where a class implements multiple interfaces
 */
interface Greet {
    // abstraction
    void greet();
}

interface Print {
    //abstraction
    void print();
}
class MultipleInheritance implements Greet, Print {
    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.greet();
        multipleInheritance.print();
    }

    @Override
    public void greet() { // implementation or definition
        System.out.println("Good Morning!!");
    }

    @Override
    public void print() { // implementation or definition
        System.out.println("Printed 4 pages!!");
    }
}
