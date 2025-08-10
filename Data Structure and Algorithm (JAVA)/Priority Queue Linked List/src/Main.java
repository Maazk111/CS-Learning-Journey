class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class PriorityQueue {
    Node front;
    Node rear;
    int size;
    int count;

    PriorityQueue(int size) {
        this.front = null;
        this.rear = null;
        this.size = size;
        this.count = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return count == size;
    }

    public void enQueue(int val) {
        Node newNode = new Node(val);
        System.out.println("EnQueued Element: " + val);
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        // Insert in sorted order: smallest data values at the front
        if (front == null || val < front.data) {
            newNode.next = front;
            front = newNode;
            if (rear == null) {
                rear = newNode; // If the queue was empty, rear will also point to the new node
            }
        } else {
            // Find the insertion point
            Node current = front;
            while (current.next != null && current.next.data < val) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            if (current == rear) {
                rear = newNode; // If the new node is inserted at the end, update the rear pointer
            }
        }
        count++;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int deQueuedElement = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count--;
        System.out.println("DeQueued Element: " + deQueuedElement);
        return deQueuedElement;
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue obj = new PriorityQueue(5);

        obj.enQueue(5);
        obj.enQueue(3);
        obj.enQueue(6);
        obj.enQueue(2);
        obj.enQueue(8);

        System.out.println("\n");

        while (!obj.isEmpty()) {
            obj.deQueue();
        }
    }
}
