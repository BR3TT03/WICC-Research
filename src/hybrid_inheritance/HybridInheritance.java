package hybrid_inheritance;

class Father{
    public void eye(){
        System.out.println("Father's eye");
    }
    public void hair(){
        System.out.println("Father's hair");
    }
}

class Son extends Father{
    public void bike(){
        System.out.println("Sons' bike");
    }
}
class Daughter extends Father{
    public void bike(){
        System.out.println("Daughter's bike");
    }
}
class GrandSon extends Son{
    public void intro(){
        System.out.println("I am grandson");
    }
}
public class HybridInheritance {
    public static void main(String[] args){
        GrandSon grandSon = new GrandSon();
        grandSon.intro();
        grandSon.bike(); // achieved through single inheritance

        Daughter daughter = new Daughter();
        daughter.bike();
        daughter.eye(); // achieved through hierarchical inheritance

        Son son = new Son();
        son.hair(); // achieved through hierarchical inheritance
    }
}
