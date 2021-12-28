package multiple_inheritance;

/**
 * This is the example of multiple inheritance where an interface extends multiple interfaces
 */
interface Event {
    void start();
}

interface Sports {
    void play();
}

interface Hockey extends Sports, Event {
    void show();
}

public class MultipleInheritance2 implements Hockey { // tester method
    public static void main(String[] args) {
        MultipleInheritance2 multipleInheritance2 = new MultipleInheritance2();
        multipleInheritance2.start();
        multipleInheritance2.play();
        multipleInheritance2.show();
    }

    @Override
    public void start() {
        System.out.println("Start Event");
    }

    @Override
    public void play() {
        System.out.println("Play Sports.");
    }

    @Override
    public void show() {
        System.out.println("Show Hockey.");
    }
}
