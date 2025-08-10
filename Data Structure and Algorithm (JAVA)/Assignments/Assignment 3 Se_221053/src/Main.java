import java.io.*;
import java.util.*;

class DataNode {
    List<String> contents;
    int nullCount;
    DataNode nextNode;

    DataNode(List<String> contents) {
        this.contents = contents;
        this.nullCount = calculateNullCount(contents);
        this.nextNode = null;
    }

    private int calculateNullCount(List<String> contents) {
        return (int) contents.stream().filter(Objects::isNull).count();
    }
}

class CustomLinkedList {
    DataNode root;

    void insertData(List<String> contents) {
        DataNode newNode = new DataNode(contents);
        if (root == null) {
            root = newNode;
        } else {
            DataNode current = root;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
    }

    void orderNodes() {
        if (root == null) return;
        boolean wasChanged;
        do {
            DataNode current = root;
            DataNode previous = null;
            DataNode next = root.nextNode;
            wasChanged = false;

            while (next != null) {
                if (current.nullCount > next.nullCount) {
                    wasChanged = true;
                    if (previous == null) {
                        DataNode temp = next.nextNode;
                        next.nextNode = current;
                        current.nextNode = temp;
                        root = next;
                        previous = next;
                    } else {
                        DataNode temp = next.nextNode;
                        previous.nextNode = next;
                        next.nextNode = current;
                        current.nextNode = temp;
                        previous = next;
                    }
                } else {
                    previous = current;
                }
                current = current.nextNode;
                if (current != null) {
                    next = current.nextNode;
                }
            }
        } while (wasChanged);
    }

    void printList() {
        for (DataNode node = root; node != null; node = node.nextNode) {
            System.out.println(node.contents + " - Null Elements: " + node.nullCount);
        }
    }
}

class CustomMain {
    public static void main(String[] args) {
        CustomLinkedList myList = new CustomLinkedList();

        try (BufferedReader reader = new BufferedReader(new FileReader("EmployeeList.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                List<String> data = Arrays.asList(line.split(",", -1));
                myList.insertData(data);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        myList.orderNodes();
        myList.printList();
    }
}
