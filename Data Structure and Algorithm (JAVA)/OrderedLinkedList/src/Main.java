// Suppose, we want a linked list such that whenever we insert a value,
// it is inserted in a position such that it is greater than or equal to the value of previous node but less
// than the value of the next node. Such a linked-list is called an Ordered Linked List. Write an algorithm for its insert procedure.

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
class OrderedLinkedList {
    Node head;

    public OrderedLinkedList() {
        head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        // Case 1: Empty list or insert at the beginning
        if (head == null || newNode.value <= head.value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: General insertion
        Node current = head;
        while (current.next != null && current.next.value < newNode.value) {
            current = current.next;
        }

        // Insert newNode after current
        newNode.next = current.next;
        current.next = newNode;
    }

    // Utility function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Main method for testing
    public static void main(String[] args) {
        OrderedLinkedList list = new OrderedLinkedList();
        list.insert(10);
        list.insert(5);
        list.insert(20);
        list.insert(15);

        list.printList(); // Expected output: 5 -> 10 -> 15 -> 20 -> END
    }
}
