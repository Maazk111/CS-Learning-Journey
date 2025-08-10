#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *f = NULL;
struct Node *r = NULL;

void linkedListTraversal(struct Node *ptr)
{
    printf("Printing the elements of the Linked List\n");
    while (ptr != NULL)
    {
        printf("Element: %d\n", ptr->data);
        ptr = ptr->next;
    }
}

void enqueue(int val){

   struct Node *n = (struct Node*)malloc(sizeof(struct Node));

    if(n==NULL){ // Queue Full Condition
        printf("Queue is Full");
    }
    else {

        n -> data = val;
        n -> next = NULL;

        if(f==NULL){
            f = r = n;
        }
        else{
            r -> next = n;
            r = n;
        }
    }
}

int dequeue(){

    int val = -1;
    struct Node *ptr = f;

    if(f==NULL){ // Queue Empty Condition
        printf("Queue is Empty\n");
    }
    else {

       f = f -> next;
       val = ptr -> data;
       free(ptr);
    }
    return val;
}


int main()
{

    linkedListTraversal(f);
    printf("Dequeueing element %d\n", dequeue());
    enqueue(34);
    enqueue(4);
    enqueue(7);
    enqueue(17);
    printf("Dequeueing element %d\n", dequeue());
    printf("Dequeueing element %d\n", dequeue());
    printf("Dequeueing element %d\n", dequeue());
    printf("Dequeueing element %d\n", dequeue());

    linkedListTraversal(f);

    return 0;
}
