#include <stdio.h>
#include <stdlib.h>

struct stack
{
    int size;
    int top;
    int *arr;
};

int isEmpty(struct stack *ptr ){
    if(ptr->top == -1){
       return 1; 
    }
    else{
        return 0;
    }
}

int isFull(struct stack *ptr ){

    if(ptr->top == ptr->size -1){
        return 1;
    }
    else{
        return 0;
    }
}

void push(struct stack *ptr , int val ){

    if(isFull(ptr)){
        printf("Stack Overflow Cannot push %d to the Stack  \n", val);
    }
    else{
        ptr -> top++;
        ptr -> arr[ptr->top] = val;
    }
}
int pop(struct stack *ptr){

    if(isEmpty(ptr)){
        printf("Stack Underflow Cannot pop from the Stack\n");
        return -1;
    }
    else{
        int val = ptr -> arr[ptr -> top];
        ptr -> top --;
        return val;
    }
}

int peek (struct stack *sp , int i){
    // i --> position 

    int arrayInt = sp ->top - i + 1;

    if(arrayInt < 0 ){
        printf("Not a valid position for the stack\n");
        return -1;
    } 
    else{
        return sp -> arr[arrayInt];
    }


}

int stackTop(struct stack *ptr){

    return ptr -> arr[ptr -> top ];
}

int stackBottom(struct stack *ptr){

    return ptr -> arr[0];
}

int main()
{
    struct stack *sp =(struct stack*)malloc(sizeof(struct stack));

    sp -> size = 50;
    sp -> top = -1;
    sp -> arr = (int *)malloc(sp->size * sizeof(int));

    printf("Stack has been created successfully\n");


    
    printf("Before pushing , Full: %d\n", isFull(sp));
    printf("Before pushing , Empty:%d\n", isEmpty(sp));

    push(sp , 10);
    push(sp , 45);
    push(sp , 65);
    push(sp , 34);
    push(sp , 23);
    push(sp , 54);
    push(sp , 56);
    push(sp , 45);
    push(sp , 89);
    push(sp , 6); 
    push(sp , 89);
    push(sp , 79);


    // Printing Values from the stack 

 
    for (int j = 1; j <= sp -> top + 1 ; j++)
    {
        printf("The value at index %d is %d\n", j , peek(sp , j));
    }


    printf("Stack Top is %d\n",stackTop(sp));
    printf("Stack Bottom is %d",stackBottom(sp));
 
    return 0;
}