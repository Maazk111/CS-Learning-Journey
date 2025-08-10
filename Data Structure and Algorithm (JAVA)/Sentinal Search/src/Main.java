class SentinalSearch{


        public boolean sentinalSearchAlgo(int[] arr , int key , int size){

            int temp = arr[size -1];
            arr[size -1] = key;
            int i = 0;

            while(arr[i]!=key){
                i++;
            }
            arr[size -1] = temp;

            if(i < size -1 || arr[size -1] == key){
                return true;
            }
            else {
                return false;
            }

        }


}
public class Main {
        public static void main(String[] args) {

    int[] arr = {1, 9, 5, 3, 7};

    SentinalSearch obj = new SentinalSearch();

 boolean found =   obj.sentinalSearchAlgo(arr, 5,arr.length);

    if(found){

        System.out.println("Value Exits");
    }
    else {
        System.out.println("Value do not exits");

    }

    }
}