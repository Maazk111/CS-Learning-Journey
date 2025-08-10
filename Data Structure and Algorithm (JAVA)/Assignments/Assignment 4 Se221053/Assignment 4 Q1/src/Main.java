import java.util.Stack;

class InfixToPostfix {

    // A utility function to return precedence of a given operator
    // Higher returned value means higher precedence
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // The main method that converts given infix expression to postfix expression
    public static String infixToPostfix(String expression) {
        String result = new String("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);

            // If the scanned character is an operand, add it to output
            if (Character.isLetterOrDigit(c)) {
                result += c;
            }
            // If the scanned character is an '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the scanned character is an ')', pop and output from the stack
            // until an '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression                
                else
                    stack.pop();
            } else { // an operator is encountered
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if (stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        // Pop all the remaining operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(expression));
    }
}
