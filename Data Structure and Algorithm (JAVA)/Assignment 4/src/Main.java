import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Stack {
    private int top;
    private char[] arr;

    Stack(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char ch) {
        arr[++top] = ch;
    }

    char pop() {
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class FileLineReverser {

    public static void reverseAndPrintLine(String line) {
        Stack stack = new Stack(line.length());

        // Push each character to the stack
        for (int i = 0; i < line.length(); i++) {
            stack.push(line.charAt(i));
        }

        // Pop characters from the stack and print
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String fileName = "File.txt"; // Replace with your file path

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print the original line
                reverseAndPrintLine(line); // Print the reversed line
                System.out.println(); // Print a blank line after each reversed line
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
