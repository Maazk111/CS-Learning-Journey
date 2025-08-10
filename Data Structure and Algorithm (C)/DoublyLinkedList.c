#include<stdio.h>
#include<stdlib.h>

struct Node{

    int data;
    struct Node *prevNode; 
    struct Node *next;

};

void linkedListTraversal(struct Node *head)
{
    struct Node * ptr = head;
    

    while (ptr != NULL){

        printf("Element : %d\n", ptr -> data);

        ptr = ptr -> next;
        
    }

}
void linkedListTraversalReverse(struct Node *head){

  struct Node * p = head;

  // Move to the last node
  while (p -> next != NULL)
  {
    p = p -> next;
  }

  while (p != NULL)
  {
    
    printf("Element : %d\n", p -> data);
    
    p = p -> prevNode;  

  }
  
}

int main(){

    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *fourth;

    // Allocate memory for nodes in the linked list in Heap

    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    // Link first and second nodes

    head -> data = 7;
    head -> next = second;
    head -> prevNode = NULL;

    // Link second and third nodes

    second -> data = 9;
    second -> next = third;
    second -> prevNode = head;

    // Link third and fourth nodes

    third -> data = 11;
    third -> next = fourth;
    third -> prevNode = second;

    // Terminate the list at the third node

    fourth -> data = 15;
    fourth -> next = NULL;
    fourth -> prevNode = third;

    printf("Doubly Linked list before Reverse\n");
    linkedListTraversal(head);



    printf("Doubly Linked list After Reverse\n");
    linkedListTraversalReverse(head);



    return 0;
}


