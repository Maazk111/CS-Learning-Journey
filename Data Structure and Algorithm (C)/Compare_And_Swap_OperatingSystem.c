#include <stdio.h>
#include <stdlib.h>
#include <stdatomic.h>

// Node structure for stack
typedef struct Node {
    int data;
    struct Node* next;
} Node;

// Lock-free stack structure
typedef struct LockFreeStack {
    _Atomic(Node*) top;
} LockFreeStack;

// Function to initialize the stack
void initStack(LockFreeStack* stack) {
    atomic_store(&stack->top, NULL);
}

// Function to push a value onto the stack
void push(LockFreeStack* stack, int value) {
    Node* new_node = (Node*)malloc(sizeof(Node));
    new_node->data = value;

    Node* old_top;
    do {
        old_top = atomic_load(&stack->top);
        new_node->next = old_top;
    } while (!atomic_compare_exchange_weak(&stack->top, &old_top, new_node));
}

// Function to pop a value from the stack
int pop(LockFreeStack* stack) {
    Node* old_top;
    Node* new_top;

    do {
        old_top = atomic_load(&stack->top);
        if (old_top == NULL) {
            return -1; // Stack is empty
        }
        new_top = old_top->next;
    } while (!atomic_compare_exchange_weak(&stack->top, &old_top, new_top));

    int value = old_top->data;
    free(old_top);
    return value;
}

// Main function to test the stack
int main() {
    LockFreeStack stack;
    initStack(&stack);

    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);

    printf("Popped: %d\n", pop(&stack));
    printf("Popped: %d\n", pop(&stack));
    printf("Popped: %d\n", pop(&stack));
    printf("Popped: %d\n", pop(&stack)); // Should indicate stack is empty

    return 0;
}