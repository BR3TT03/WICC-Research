package has_a_association;


class Engine {
    String power = "6000CC";
}

public class Car {
    public static void main(String[] args) {
        // building a car
        String color;
        int maxSpeed;
        // Creating an object of Car class
        Car nano = new Car();

        color = "RED";

        // Assigning car object speed
        maxSpeed = 329;

        // attaching engine in the car i.e a car has-a engine
        // instantiating engine class to establish that car has-a engine
        Engine engine = new Engine();
        // car has been built


        nano.carInfo(color, maxSpeed, engine.power);
    }

    public void carInfo(String color, int maxSpeed, String power) {
        // Print the car information - color and speed
        System.out.println("Car Color= " + color
                + " Max Speed= " + maxSpeed
                + " Engine Power = " + power);
    }
}

