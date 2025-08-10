import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        // My First Program
//        System.out.println("Hello world!");
//
//        int result = 1;
//
//        System.out.println(result);
//
//        System.out.println(++result);
//
//        result++;
//
//        System.out.println(++result);
//
//        result = -result;
//
//        System.out.println(result);
//
//        boolean success = true;
//
//        System.out.println(!success);
//
//        // Second Task
//
//        int i = 3;
//
//        i++;
//
//        System.out.println(i);
//
//        ++i;
//
//        System.out.println(i);
//
//        System.out.println(++i);
//
//        System.out.println(i++);
//
//        System.out.println(i);

        // Third Task


        Random random = new Random();
        
        int n = random.nextInt(4);

        System.out.println(n);

        if (n > 0) {
            System.out.println("n > 0");
        }
    }
}