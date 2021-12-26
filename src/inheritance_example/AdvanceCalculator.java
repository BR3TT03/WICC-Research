package inheritance_example;

public class AdvanceCalculator extends Calculator{
    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a/b;
    }

    public static void main(String args[]){
        // initializing variable a and b
        int a =2;
        int b = 8;
        AdvanceCalculator obj = new AdvanceCalculator();
        System.out.println(obj.add(a,b)); // calling parent method add(a,b) through inheritance
        System.out.println(obj.mul(a,b));
        System.out.println(obj.sub(a,b)); // calling parent method sub(a,b) through inheritance
        System.out.println(obj.div(a,b));
    }
}
