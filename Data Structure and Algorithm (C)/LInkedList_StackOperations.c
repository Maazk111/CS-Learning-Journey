#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node *next;
};

void linkedListTraversal(struct Node *ptr)
{
    while (ptr != NULL)
    {
        printf("Element: %d\n", ptr->data);
        ptr = ptr->next;
    }
}

int isEmpty(struct Node* top){

    if(top == NULL){
        return 1;
    }
    else{
        return 0;
    }
    

}

int isFull(struct Node* top){

    struct Node * p = (struct Node*)malloc(sizeof(struct Node));
    if(p == NULL){
        return 1;
    }
    else{
        return 0;
    }
}

struct Node* push(struct Node* top , int x ){
    // Inserting Node at Index 0
    if(isFull(top)){
        printf("Stack OverFlow");
    }
    else{

        struct Node* n = (struct Node*)malloc(sizeof(struct Node));
        n -> data = x;
        n -> next = top;
        top = n;
        return top;
    }
}
int pop(struct Node** top){
    // Deleting Node at Index 0
    if(isEmpty(*top)){
        printf("Stack underFlow");
    }
    else{
        struct Node * n = *top;
        *top = (*top) -> next;
        int x = n -> data;
        free(n);
        return x;
    }
}
int main(){

    struct Node *top = NULL;

    top =  push(top,28);
    top =  push(top,18);
    top =  push(top,15);
    top =  push(top,7);
    linkedListTraversal(top);


    int element = pop(&top); // Sending Address through Pointer
    // Another Implementation of pop 
    // Make it Global Variable Implementation is in other file name: Linked_List_PopStack2
    printf("popped element is %d\n" , element);



    linkedListTraversal(top);

    return 0;
}