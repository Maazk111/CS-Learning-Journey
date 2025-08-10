import java.util.Stack;

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

    // Enqueue at rear
    public void enQueueRear(int val) {
        Node newNode = new Node(val);
        System.out.println("EnQueued at Rear: " + val);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue from front
    public int deQueueFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    // Enqueue at front
    public void enQueueFront(int val) {
        System.out.println("EnQueued at Front: " + val);
        Node newNode = new Node(val);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
    }

    // Dequeue from rear
    public int deQueueRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return -1;
        }
        if (front == rear) {
            int value = rear.data;
            front = rear = null;
            return value;
        }
        Node current = front;
        while (current.next != rear) {
            current = current.next;
        }
        int value = rear.data;
        rear = current;
        rear.next = null;
        return value;
    }

    // Reverse the first K elements of the queue
    public void reverseFirstKElements(int k) {
        if (isEmpty() || k > size() || k <= 0) {
            System.out.println("Invalid operation or Queue is empty");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        // Dequeue first K elements and push them onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(deQueueFront());
        }

        // Enqueue back the elements from the stack
        while (!stack.isEmpty()) {
            enQueueRear(stack.pop());
        }

        // Move the remaining elements from front to rear
        for (int i = 0; i < size() - k; i++) {
            enQueueRear(deQueueFront());
        }
    }

    // Helper method to get the size of the queue
    private int size() {
        int count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        QueueLinkedList deque = new QueueLinkedList();
        deque.enQueueRear(1);
        deque.enQueueRear(2);
        deque.enQueueRear(3);
        deque.enQueueRear(4);
        deque.enQueueRear(5);

        System.out.println("DeQueuing from front: " + deque.deQueueFront()); // 1
        deque.enQueueFront(6);
        System.out.println("DeQueuing from rear: " + deque.deQueueRear()); // 5

        deque.reverseFirstKElements(3);
        while (!deque.isEmpty()) {
            System.out.println(deque.deQueueFront());
        }
    }
}
