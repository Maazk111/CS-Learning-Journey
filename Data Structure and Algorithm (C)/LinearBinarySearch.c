#include<stdio.h>
int linearSearch(int arr[], int size,int element){

for (int i = 0; i < size; i++)
{
    if(arr[i]==element){
        return i;
    }
}
return -1;
}

int binarySearch(int arr[],int size,int element){

    int low, mid, high;
    low = 0;
    
    high = size-1;

    // Start searching
    // Keep Searching until low <= high 

    while(low <= high){
    mid = (low + high)/2;
    if (arr[mid] == element){
        return mid;
    }
    if(arr[mid] < element){

    low = mid + 1;

    }
    else
    {
        // if(arr[mid] > element)
        high = mid - 1;
    }

}


  // Searching ends
  return -1;

}

int main(){

    // Unsorted for Linear Search

    // int arr[] = {1,3,5,56,64,73,123,225,444};
    // int size = sizeof(arr)/sizeof(int);
    // int element = 5;


    int arr[] = {100,110,120,150,155,200,400,800};
    int size = sizeof(arr)/sizeof(int);
    int element = 200;
    
    int searchIndex = binarySearch(arr, size ,element);
    printf("the element %d was found at index %d", element , searchIndex);
    


    return 0;
}