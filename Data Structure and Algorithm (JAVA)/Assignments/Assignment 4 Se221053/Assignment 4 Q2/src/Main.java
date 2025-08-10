import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

class ReverseLines {

    public static void main(String[] args) {
        String filePath = "TestFile.txt"; // Replace with your file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print the line as it is
                printReversedLine(line); // Print the reversed line
                System.out.println(); // Print a blank line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printReversedLine(String line) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the line to the stack
        for (int i = 0; i < line.length(); i++) {
            stack.push(line.charAt(i));
        }

        // Pop characters from the stack and print
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
