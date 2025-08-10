class Deque {
    int size;
    int front;
    int rear;
    int[] arr;

    Deque(int size) {
        this.size = size;
        front = rear = 0;
        arr = new int[size];
    }

    boolean isEmpty() {
        return front == rear;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Insert at rear
    public void enQueueRear(int val) {
        if (isFull()) {
            System.out.println("Deque Overflow");
        } else {
            arr[rear] = val;
            rear = (rear + 1) % size;
            System.out.println("Enqueued at rear: " + val);
        }
    }

    // Delete from front
    public int deQueueFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return -1;
        } else {
            int val = arr[front];
            front = (front + 1) % size;
            return val;
        }
    }

    // Insert at front
    public void enQueueFront(int val) {
        if (isFull()) {
            System.out.println("Deque Overflow");
        } else {
            front = (front - 1 + size) % size;
            arr[front] = val;
            System.out.println("Enqueued at front: " + val);
        }
    }

    // Delete from rear
    public int deQueueRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return -1;
        } else {
            rear = (rear - 1 + size) % size;
            return arr[rear];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        deque.enQueueRear(5);
        deque.enQueueFront(4);
        deque.enQueueRear(6);
        deque.enQueueFront(3);
        deque.enQueueRear(7); // Deque is now full

        System.out.println("Dequeued from front: " + deque.deQueueFront()); // Output: 3
        System.out.println("Dequeued from rear: " + deque.deQueueRear()); // Output: 7
    }
}
