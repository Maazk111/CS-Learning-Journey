class MultiParenthesisMatcher{

    static class Stack{
        int size;
        int top;
        char[] arr;

        Stack(int size){
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

        void push(char val){
            if(isFull()){
                System.out.println("Stack Overflow. Cannot push " + val + " to the stack.");
            }
            else {
                top++;
                arr[top] = val;
            }
        }

        char pop(){
            if (isEmpty()){
                System.out.println("Stack Underflow. Cannot pop from the stack.");
                return '\0'; // Returning null character as an error value
            }
            else {
                return arr[top--];
            }
        }
    }
    static boolean match(char a , char b) { // Creating outside cuz i can't call inside of the static Class(Stack) and make it static cuz i can be called in static method
        if(a == '(' && b == ')'){
            return true;
        }
        if(a == '[' && b == ']'){
            return true;
        }
        if(a == '{' && b == '}'){
            return true;
        }
        else {
            return false;
        }
    }
    static boolean multiParenthesisMatch(String exp){
        Stack sp = new Stack(100);
        char popped_ch;

        for (int i = 0; i < exp.length() ; i++) {
            char c = exp.charAt(i); // used to access individual characters from the string exp.

            if(c == '(' || c == '[' || c == '{' ){
                sp.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if(sp.isEmpty()){
                    return false;
                }
                popped_ch = sp.pop();

                if(!match(popped_ch, c)){
                    return false;
                }

            }

        }
        if (sp.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

}
public class Main {
    public static void main(String[] args) {

        String exp = "{(8)*[5-5]*(8/3)}";

        // Check if parenthesis is matching
        if (MultiParenthesisMatcher.multiParenthesisMatch(exp)) {
            System.out.println("The parenthesis is matching.");
        } else {
            System.out.println("The parenthesis is not matching.");
        }

    }
}