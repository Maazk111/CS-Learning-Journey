class PriorityQueue {
    int size;
    int front;
    int rear;
    int[] arr;

    PriorityQueue(int size) {
        this.size = size;
        front = rear = -1;
        arr = new int[size];
    }

    boolean isEmpty() {
        return front == -1 || front > rear;
    }


    boolean isFull() {
        return rear == size - 1;
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            arr[++rear] = val; // Insert at the end
            int current = rear;
            while (current > front && arr[current] < arr[current - 1]) {
                swap(current, current - 1);
                current--;
            }
            System.out.println("EnQueued Element: " + val);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("No Element to deQueue");
            return -1;
        } else {
            int deQueuedElement = arr[front];
            front++;
            if (front > rear) { // Queue becomes empty
                front = rear = -1;
            }
            return deQueuedElement;
        }
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
       // obj.enQueue(7); // Can't enQueue because the queue is Full

        System.out.println("\nDeQueued Element: " + obj.deQueue());
        System.out.println("DeQueued Element: " + obj.deQueue());
        System.out.println("DeQueued Element: " + obj.deQueue());
        System.out.println("DeQueued Element: " + obj.deQueue());
        System.out.println("DeQueued Element: " + obj.deQueue());
    }
}
