class Deque {
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node front, rear;

    public Deque() {
        front = rear = null;
    }

    boolean isEmpty() {
        return (front == null);
    }

    void insertFront(int key) {
        Node newNode = new Node(key);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    void insertRear(int key) {
        Node newNode = new Node(key);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    void deleteFront() {
        if (isEmpty()) return;
        Node temp = front;
        front = front.next;
        if (front == null) rear = null;
        else front.prev = null;
    }

    void deleteRear() {
        if (isEmpty()) return;
        Node temp = rear;
        rear = rear.prev;
        if (rear == null) front = null;
        else rear.next = null;
    }

    int getFront() {
        if (isEmpty()) return Integer.MIN_VALUE;
        return front.data;
    }

    int getRear() {
        if (isEmpty()) return Integer.MIN_VALUE;
        return rear.data;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.insertRear(5);
        deque.insertRear(10);
        deque.insertFront(15);

        System.out.println("Front element: " + deque.getFront());
        System.out.println("Rear element: " + deque.getRear());

        deque.deleteFront();
        System.out.println("After deleting front, new front is: " + deque.getFront());
    }
}
