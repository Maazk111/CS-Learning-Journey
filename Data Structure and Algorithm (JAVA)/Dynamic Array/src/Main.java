class DynamicArray{

    public static int[] reSize(int[] arr, int newSize){
        int[] newArr = new int[newSize];

        if (arr.length<=newSize){
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            return newArr;
        }
        for(int i = 0; i < newSize; i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static int[] insert(int[] arr, int val){
        int[] newArr = new int[arr.length +1];

        newArr[arr.length] = val;

        for (int i = 0 ; i < arr.length ; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] insertAtIndex(int[] arr,int index, int val){
        int[] newArr = new int[arr.length +1];

    int j = 0;
    for (int i = 0; i < newArr.length; i++){

        if(i!=index){
            newArr[i] = arr[j];
            j++;
        }
        else{
            newArr[i] = val;
        }
    }
    return newArr;
}
public static int[] deleteAtIndex(int arr[], int index){
        int[] newArr = new int[arr.length-1];

        // Copy elements before the index
        for(int i = 0; i < index; i++){
            newArr[i] = arr[i];
        }
         // Skip the element at the index and copy the rest
        for(int i = index + 1; i <arr.length; i++){
            newArr[i - 1] = arr[i];
        }

        return newArr;

}
    public static int[] updateAtIndex(int arr[], int index, int val){
        int[] newArr = new int[arr.length];

        for(int i = 0; i <arr.length; i++){

            if(index == i){
                newArr[i] = val;
            }
            else {
                newArr[i] = arr[i];
            }
        }

        return newArr;

    }
    public static int[] updateByValue(int arr[], int value, int val){
        int[] newArr = new int[arr.length];

        for(int i = 0; i <arr.length; i++){

            if(arr[i] == value){
                newArr[i] = val;
            }
            else {
                newArr[i] = arr[i];
            }
        }

        return newArr;

    }


}
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//      arr = DynamicArray.reSize(arr, 7);
//      arr =   DynamicArray.insert(arr, 8);
//      arr =   DynamicArray.insertAtIndex(arr, 2, 9);
//      arr = DynamicArray.deleteAtIndex(arr, 3);
//      arr = DynamicArray.updateAtIndex(arr, 1, 7);
        arr = DynamicArray.updateByValue(arr, 2, 9);

        for (int x: arr) {
            System.out.println(x);
        }

    }
}