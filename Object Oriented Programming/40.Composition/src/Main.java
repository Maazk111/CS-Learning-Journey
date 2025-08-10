// A class representing a Car
class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String color;

    public Car(Engine engine, Wheel[] wheels, String color) {
        this.engine = engine;
        this.wheels = wheels;
        this.color = color;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void drive() {
        System.out.println("The car is driving on " + wheels.length + " wheels.");
    }

    public String getColor() {
        return color;
    }
}

// A class representing an Engine
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

// A class representing a Wheel
class Wheel {
    // Wheel implementation details
}

// Main class to demonstrate composition
public class Main {
    public static void main(String[] args) {
        // Create an Engine object
        Engine engine = new Engine();

        // Create an array of Wheel objects
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }

        // Create a Car object using composition
        Car car = new Car(engine, wheels, "Red");

        // Perform car operations
        car.start();
        car.drive();
        car.stop();

        // Get car color
        String carColor = car.getColor();
        System.out.println("Car color: " + carColor);
    }
}
