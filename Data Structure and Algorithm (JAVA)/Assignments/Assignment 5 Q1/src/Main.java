class QueueReverser {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedListQueue {
        Node front, rear;

        public LinkedListQueue() {
            this.front = this.rear = null;
        }

        void enqueue(int key) {
            Node temp = new Node(key);
            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }
            this.rear.next = temp;
            this.rear = temp;
        }

        void dequeue() {
            if (this.front == null)
                return;
            this.front = this.front.next;
            if (this.front == null)
                this.rear = null;
        }

        boolean isEmpty() {
            return front == null;
        }

        int front() {
            if (this.front == null)
                return Integer.MIN_VALUE;
            return this.front.data;
        }

        int size() {
            int size = 0;
            Node current = front;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }
    }

    // Function to reverse the first K elements of the Queue
    static void reverseKElements(int k, LinkedListQueue queue) {
        if (queue.isEmpty() || k > queue.size()) {
            System.out.println("Queue is empty or the value of k is greater than the size of the queue");
            return;
        }

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.front());
            queue.dequeue();
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.enqueue(queue.front());
            queue.dequeue();
        }
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        int k = 3;
        reverseKElements(k, queue);

        System.out.println("Queue after reversing first " + k + " elements:");
        while (!queue.isEmpty()) {
            System.out.print(queue.front() + " ");
            queue.dequeue();
        }
    }
}
