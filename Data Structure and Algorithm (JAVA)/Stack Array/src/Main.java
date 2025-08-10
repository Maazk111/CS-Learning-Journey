class Stack {
    int top;
    int size;
    int[] arr;
    int count = 0;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = data;
            count++;
            System.out.println("Count: " + count);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            count--;
            return arr[top--];
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Top Element: " + arr[top]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack obj = new Stack(5);
        obj.push(5);
        obj.push(7);
        obj.push(8);
        obj.peek();
        obj.pop();
        obj.peek();
        obj.pop();
        obj.peek();
        obj.push(15);
        obj.push(51);
        obj.peek();
    }
}
