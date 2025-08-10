public class Main {

    static int count = 0;

    public Main(){
        count +=1;
    }
    public static void main(String[] args) {

        new Main();
        new Main();
        new Main();

        System.out.println("ayaz");
        System.out.println(count);


    }
}