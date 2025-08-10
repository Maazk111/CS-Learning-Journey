class ParenthesisMatcher {

    static class Stack {
        int size;
        int top;
        char[] arr;

        Stack(int size) {
            this.size = size;
            this.top = -1;
            this.arr = new char[size];
        }

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == size - 1;
        }

        void push(char val) {
            if (isFull()) {
                System.out.println("Stack Overflow. Cannot push " + val + " to the stack.");
            } else {
                arr[++top] = val;
            }
        }

        char pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow. Cannot pop from the stack.");
                return '\0'; // Returning null character as an error value
            } else {
                return arr[top--];
            }
        }
    }

    static boolean parenthesisMatch(String exp) {
        Stack sp = new Stack(100);

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i); // used to access individual characters from the string exp.

            if (c == '(') {
                sp.push(c);
            } else if (c == ')') {
                if (sp.isEmpty()) {
                    return false;
                }
                sp.pop();
            }
        }

        return sp.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "(8)*(9)";

        // Check if parenthesis is matching
        if (parenthesisMatch(exp)) {
            System.out.println("The parenthesis is matching.");
        } else {
            System.out.println("The parenthesis is not matching.");
        }
    }
}
