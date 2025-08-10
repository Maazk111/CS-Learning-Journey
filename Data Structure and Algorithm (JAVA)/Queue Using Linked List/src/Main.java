class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;

    QueueLinkedList() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int val) {
        Node newNode = new Node(val);
        System.out.println("EnQueued Element: " + val);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {  // This part checks if, after the dequeue operation, the queue has become empty (i.e., front is null).

            rear = null; // If the queue is now empty, it also sets the rear pointer to null. This is important because,
        }               // in an empty queue, both front and rear should be null.
                       // It ensures the integrity of the queue for future operations.
        return value;

    }
}

public class Main {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);

        System.out.println("\nDeQueued Element: " + queue.deQueue());
        System.out.println("DeQueued Element: " + queue.deQueue());
        System.out.println("DeQueued Element: " + queue.deQueue());
        System.out.println("DeQueued Element: " + queue.deQueue());
        System.out.println("DeQueued Element: " + queue.deQueue());
    }
}
