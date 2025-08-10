class EkClass{
    int a;
    String str;
    public int getA() {
        return a;
    }
    EkClass(int a, String str){
        this.str = str;
        this.a = a;
        System.out.println(a + str);
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c) {
        super(c , " Hello");
    System.out.println("I am a constructor   " + c + " \t" + str);

       // System.out.println(c);        // to print the of C
    }
}
public class Main {
    public static void main(String[] args) {

        EkClass e = new EkClass(65, " yes");
        DoClass d = new DoClass(5);
//        System.out.println(e.getA());  // Output is 65
    }
}