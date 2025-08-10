import java.util.Random;

class Searching_Tech<G>{
    public boolean linearSearch(G[] arr, G val){
        for (int i = 0; i <arr.length; i++){
            if(arr[i]==val){
                return  true;
            }
        }
        return false;

    }
    public boolean twoWaySeacrh(G[] arr , G val){
        int i = 0, j = arr.length-1;

        while (i<=j){

                if(arr[i] == val || arr[j] == val){
                    return true;
                }
                i++;
                j--;

        }
        return false;
    }


    public boolean SimpleProbabilisticSearch(G[] numbers , G numberToFind) {


            boolean found = false;
            Random random = new Random();
            int attempts = 0;

            while (!found) {
                int index = random.nextInt(numbers.length); // Generate a random index
                if (numbers[index] == numberToFind) {
                    found = true; // Number is found
                    System.out.println("Found " + numberToFind + " at index " + index + " after " + attempts + " attempts.");
                    return found;
                }
                attempts++;
            }
            return found;
        }

}


public class Main {
    public static void main(String[] args) { 

       // Integer[] arr = {1, 2, 3, 4, 5};

        Integer[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Sample array
        Integer numberToFind = 70; // Number to find

        Searching_Tech<Integer> obj = new Searching_Tech();


       //  System.out.println(obj.linearSearch(arr,2));
       // System.out.println(obj.twoWaySeacrh(arr, 4));
        obj.SimpleProbabilisticSearch(numbers, numberToFind);




    }
}