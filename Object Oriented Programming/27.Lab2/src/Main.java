class Animal{                         // Super Class
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{                 // Sub Class of Animal and Super class of BabyDog
    void bark(){
        System.out.println("Barking...");
    }
}
   // if one subclass inherits properties or methods from parent class is called Single Inheritance.
// this is single inheritence from Animal to Dog


class BabyDog extends Dog{                  //Sub Class of Dog 

    void weep(){
        System.out.println("Weeping...");

    }
}
// A child class from a parent which in turn inherits from another class is Called Multi-Level Inheritance
// This is Multi-Level Inheritance form BabaDog to Dog to Animal

public class Main {
    public static void main(String[] args) {
        System.out.println("LAB task");
                                               // multiple inheritance not allow error Diamond error

//        Animal a = new Animal();
//        a.eat();

        BabyDog b = new BabyDog();    // Creating OBJ through Constructor
        b.bark();
        b.eat();
        b.weep();
    }
}