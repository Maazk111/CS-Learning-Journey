import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*    Write a Program of a given Student of CBSE board Exam.His Marks form 5 Subject must be Taken as Input.
      Marks are out of 100.
                            */

        System.out.println("Percentage Calculator");

        Scanner sc = new Scanner(System.in);
        System.out.print("Maths: ");
        float Maths = sc.nextFloat();

        System.out.print("Phy: ");
        float Phy = sc.nextFloat();

        System.out.print("Eng: ");
        float Eng = sc.nextFloat();

        System.out.print("Chem: ");
        float Chem = sc.nextFloat();

        System.out.print("Comp: ");
        float Comp = sc.nextFloat();


        float sum = Maths + Phy + Eng + Chem + Comp;



        float res = (sum/500)*100 ;

        System.out.println("Your Percentage is: " +res + "%" );

    }
}