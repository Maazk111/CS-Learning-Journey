abstract class Animal {
    // Abstract method (to be overridden in subclasses)
    public abstract void sound();

    // Static method (binding happens at compile-time)
    public static void info() {
        System.out.println("This is an animal");
    }
}
class Dog extends Animal {
    // Overridden method (dynamic binding happens at runtime)
    public void sound() {
        System.out.println("The dog says: Woof Woof!");
    }

    // Static method in subclass
    public static void info() {
        System.out.println("This is a dog");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound(); // dynamic binding (outputs "The dog says: Woof Woof!")

        myAnimal.info(); // This will not work as expected. It will not call Dog's info() method
        Dog.info();      // This will output "This is a dog"
        Animal.info();   // This will output "This is an animal"
    }
}
