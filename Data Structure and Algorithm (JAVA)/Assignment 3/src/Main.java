import java.io.*;
import java.util.*;

class Node {
    String[] data;
    int missingElements;
    Node next;

    Node(String[] data) {
        this.data = data;
        this.missingElements = countMissingElements(data);
        this.next = null;
    }

    static int countMissingElements(String[] data) {
        int count = 0;
        for (String element : data) {
            if (element == null || element.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }
}

class LinkedList {
    Node head;

    void addNode(String[] data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void sortList() {
        if (head == null) return;
        for (Node i = head; i != null; i = i.next) {
            for (Node j = head; j.next != null; j = j.next) {
                if (j.missingElements > j.next.missingElements) {
                    String[] tempData = j.data;
                    int tempMissing = j.missingElements;
                    j.data = j.next.data;
                    j.missingElements = j.next.missingElements;
                    j.next.data = tempData;
                    j.next.missingElements = tempMissing;
                }
            }
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(Arrays.toString(temp.data) + " - Missing Elements: " + temp.missingElements);
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        try (BufferedReader br = new BufferedReader(new FileReader("EmployeeList.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",", -1);
                list.addNode(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.sortList();
        list.display();
    }
}
