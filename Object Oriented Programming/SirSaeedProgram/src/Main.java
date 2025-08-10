class Studen
{
    int age = 22;
    String name = "Maaz";
    void study()
    {
        System.out.println("He Studies");
    }
}
// MAIN CLASS
public class Main {
    public static void main(String[] args)
    {

        Studen obj = new Studen();
        System.out.println("His age is = " +obj.age );
        obj.study();
        System.out.println("His age is = " +obj.name );


        //  std obj = new std();

    }
}