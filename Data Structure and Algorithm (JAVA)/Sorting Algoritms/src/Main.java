import java.sql.Array;

class SortingAlgos{

    public static void printArray(int [] Arr , int n){

        for (int i = 0; i < n ; i++){

            System.out.print(Arr[i]+ " ");

        }
    }

    public static void bubbleSort(int [] Arr , int n ){

        for (int i = 0; i < n - 1 ; i++){ // For number of pass

            for (int j = 0 ; j < n-1-i ; j++){ // For comparison in each pass
                if (Arr[j] > Arr[j+1]){
                  int temp = Arr[j];
                  Arr[j] = Arr[j+1];
                  Arr[j+1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int [] Arr , int n ){

        int indexOfMin , temp;

        for (int i = 0; i < n - 1 ; i++) {

            indexOfMin = i;
            for (int j = i + 1; j < n  ; j++) {

                if (Arr[j] < Arr[indexOfMin]){  // Finding the Min Index or element
                    indexOfMin = j;    // Passes The index of Min
                }

            }
            // Swap the found minimum element with the first element
            temp = Arr[i];
            Arr[i] = Arr[indexOfMin];
            Arr[indexOfMin] = temp;
        }
    }

    public static void insertionSort(int[] Arr , int n){

        int key , j;

        for (int i = 1; i <= n - 1 ; i++) {

            key = Arr[i];
            j = i - 1;

            while (j>=0 && Arr[j] > key){ // j>= 0 bzc j can't be compared to index -1

                Arr[j + 1] = Arr[j];
                j--;

            }
            Arr[j+1] = key;
        }
    }

    public static void merge(int []Arr, int mid, int low, int high)
    {
        int [] B = new int[100];
        int i, j, k;
        i = low;
        j = mid + 1;
        k = low;

        while (i <= mid && j <= high)
        {
            if (Arr[i] < Arr[j])
            {
                B[k] = Arr[i];
                i++;
                k++;
            }
            else
            {
                B[k] = Arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid)
        {
            B[k] = Arr[i];
            k++;
            i++;
        }
        while (j <= high)
        {
            B[k] = Arr[j];
            k++;
            j++;
        }
        for (i = low; i <= high; i++)
        {
            Arr[i] = B[i];
        }

    }

    public static void mergeSort(int []Arr, int low, int high){
        int mid;
        if(low<high){
            mid = (low + high) /2;
            mergeSort(Arr, low, mid);
            mergeSort(Arr, mid+1, high);
            merge(Arr, mid, low, high);
        }
    }


}

public class Main {
    public static void main(String[] args) {

        SortingAlgos obj = new SortingAlgos();
       // int [] Arr = {1, 2, 5, 6, 12, 54, 625, 7, 23, 9, 987};
       // int [] Arr = {8, 0, 7, 1, 3};
        int [] Arr = {12, 54, 65, 7, 23, 9};
        int n = Arr.length;

        SortingAlgos.printArray(Arr, n);
        // Bubble Sort
//        SortingAlgos.bubbleSort(Arr,  n);
//        System.out.println();
//        SortingAlgos.printArray(Arr, n); // Sorted Array

        // Selection Sort
//        SortingAlgos.selectionSort(Arr, n);
//        System.out.println();
//        SortingAlgos.printArray(Arr, n); // Sorted Array

        // Insertion Sort
//        SortingAlgos.insertionSort(Arr, n);
//        System.out.println();
//        SortingAlgos.printArray(Arr, n); // Sorted Array


        // Merge Sort
        SortingAlgos.mergeSort(Arr, 0, n - 1);
        System.out.println();
        SortingAlgos.printArray(Arr, n); // Sorted Array






    }
}