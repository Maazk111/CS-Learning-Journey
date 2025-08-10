#include<stdio.h>
#include <stdlib.h>

struct myArray
{
    int total_size;
    int used_size;
    int *ptr;
};
 
void createArray(struct myArray * a, int tSize, int uSize){
    // (*a).total_size = tSize;
    // (*a).used_size = uSize;
    // (*a).ptr = (int *)malloc(tSize * sizeof(int));
 
    a->total_size = tSize;
    a->used_size = uSize;
    a->ptr = (int *)malloc(tSize * sizeof(int));
}
 
void show(struct myArray *a){
	int i;
    for (i = 0; i < a->used_size; i++)
    {
        printf("%d\n", (a->ptr)[i]);
    }
}
 
void setVal(struct myArray *a){
    int n;
    int i;
    for (i = 0; i < a->used_size; i++)
    {
        printf("Enter element %d: ", i);
        scanf("%d", &n);   // we can also write this also scanf("%d", &(a->ptr)[i]);
        (a->ptr)[i] = n; // n is to refer the this (a->ptr)[i]
    }
    
}
 
int main(){
    struct myArray marks;
    createArray(&marks, 10, 2);
    printf("We are running setVal now\n");
    setVal(&marks);
 
    printf("We are running show now\n");
    show(&marks);
 
    return 0;
}

