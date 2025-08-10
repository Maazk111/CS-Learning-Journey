class InfixToPostfix {

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

        char stackTop() {
            if (!isEmpty()) {
                return arr[top];
            } else {
                return '\0'; // Returning null character for an empty stack
            }
        }
    }

    static int precedence(char ch) {
        if (ch == '*' || ch == '/') {
            return 3;
        } else if (ch == '+' || ch == '-') {
            return 2;
        } else {
            return 0;
        }
    }

    static boolean isOperator(char ch) {
        return ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }

    static String infixToPostfix(String infix) {
        Stack stack = new Stack(infix.length());
        StringBuilder postfix = new StringBuilder();
        int i = 0;

        while (i < infix.length()) {
            char c = infix.charAt(i); // used to access individual characters from the string exp.

            if (!isOperator(c)) {
                postfix.append(c); //  infix[i] is Added to the Post fix
                i++;
            } else {

                if(precedence(c) > precedence(stack.stackTop())){
                    stack.push(c);
                    i++;
                }
                else {

                    postfix.append(stack.pop());

                }


            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "x-y/z-k*d";
        System.out.println("Postfix is: " + infixToPostfix(infix));
    }
}
