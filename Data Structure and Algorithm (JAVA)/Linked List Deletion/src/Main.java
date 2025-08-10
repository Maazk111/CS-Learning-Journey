class Node {
    int data;
    Node next; // User-defined data type

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    static void traversal(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        System.out.println("Count: " + count);
    }

    static Node deleteAtFirst(Node head) {
        if (head == null) return null; // Check for empty list

        return head.next;
    }

    static Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) return null; // Check for empty or single element list

        Node curr = head;
        Node curr2 = head.next;

        while (curr2.next != null) {
            curr = curr.next;
            curr2 = curr2.next;
        }

        curr.next = null;
        return head;
    }

    static Node deleteAtIndex(Node head, int index) {
        if (head == null || index < 0) return head; // Check for empty list or negative index

        if (index == 0) return head.next; // Delete at start

        Node curr = head;
        Node curr2 = head.next;

        int count = 0;
        while (count < index - 1 && curr2 != null) {
            curr = curr.next;
            curr2 = curr2.next;
            count++;
        }
/*                             curr2 != null
This is a safety check to ensure that we do not try to access a node beyond the end of the list.
If curr2 becomes null, it means we've reached the end of the list and the index provided is out of bounds.
*/

        if (curr2 == null) return head; // Index out of bounds

        curr.next = curr2.next;
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        Node p5 = new Node(50);
        Node p6 = new Node(60);

        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;

        Node.traversal(head);

        // Test deletion methods
//        head = Node.deleteAtFirst(head);
//        Node.traversal(head);

//        head = Node.deleteAtEnd(head);
//        Node.traversal(head);

        head = Node.deleteAtIndex(head, 2);
        Node.traversal(head);
    }
}
