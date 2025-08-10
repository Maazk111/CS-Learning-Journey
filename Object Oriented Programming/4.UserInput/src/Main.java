import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        import java.util.Scanner;    Importing  the Scanner class
//        Scanner sc = new Scanner(System.in);  Creating an object named "sc" of the Scanner class.


//        Scanner S = new Scanner(System.in);   (Read from the keyboard)
//        int a = S.nextInt();   (Method to read from the keyboard)

        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();

        float f1 = sc.nextFloat();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        float f2 = sc.nextFloat();



        int sum = a + b;
        float sum2 = f1 + f2;

        System.out.println("The sum of these INT numbers is");
        System.out.println(sum);

        System.out.println("The sum of these Float numbers is");
        System.out.println(sum2);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();     Without Space
//
//        String str = sc.nextLine();  With Space
//        System.out.println(str);
    }
}