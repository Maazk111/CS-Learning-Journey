import java.util.Scanner;

class MaxPair{

    public static int maxPair(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");

        int n = sc.nextInt();

        int [] A = {0,1, 2, 3 , 4, 5 , 6, 7, 8, 9};
        int result = 0;

        for (int i = 0 ; i<= n ; i++ ){
            for (int j = i + 1 ; j <= n ; j++){

                if(A[i] * A[j] > result){
                    result  = A[i] * A[j];
                }
            }

        }
        System.out.println(result);
        return  result;
    }



}
public class Main {
    public static void main(String[] args) {

        MaxPair.maxPair();



    }
}