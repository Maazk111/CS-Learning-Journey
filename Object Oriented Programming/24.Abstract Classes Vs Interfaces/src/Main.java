// Interfaces

interface BikeF1 {           //BikeF1 means 1st feature of Bike...follows....
    void speedUp(int increment);

    void speedDown(int decrement);
}

    /*
    interface BikeF2{
    void horn1();
    void horn2();
    }
    */

interface BikeF3{
    void gearUp(int increment);
    void geardown(int decrement);
}

class Fz implements BikeF1, BikeF3{
    public void speedUp(int increment){
        System.out.println("The speedUp is  "+ increment);
    }
    public void speedDown(int decrement){
        System.out.println("The speedDown is " + decrement);
    }
    public void gearUp(int increment){
        System.out.println("The gear should go when speed goes Up " + increment);
    }
    public void geardown(int decrement){
        System.out.println("The gear should go down when speed goes Down " + decrement);
    }
}

public class Main{
    public static void main(String [] args){
        Fz myfz= new Fz();
        myfz.speedUp(100);
        myfz.gearUp(5);
        myfz.speedDown(20);
        myfz.geardown(2);
    }
}