class Node {
    int data;
    Node next; // user Define Data type

    Node(int data){
        this.data = data;
        this.next = null;
    }

    static void Traversal(Node head){
        int count = 0;
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
            count++;
        }
        System.out.println("Count: " + count);
    }

  static Node insertAtFirst(Node head, int data){
        Node curr = new Node(data);

        curr.next = head;
        head = curr;

        return head;

    }

    static Node insertAtEnd(Node head, int data){
        Node curr = new Node(data);

        Node ptr = head;

        while (ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = curr;
        curr.next = null;

        return head;

    }
    static Node insertAtIndex(Node head, int data , int index ){

        Node curr = new Node(data);
        Node ptr = head;

        int count = 0;

        while (count!=index-1){
            ptr = ptr.next;
            count++;
        }
        curr.next = ptr.next;
        ptr.next = curr;

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

        //  System.out.println(p1.next);

        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;

        Node.Traversal(head);

       // head =  Node.insertAtFirst(head, 7);  // Insert At First
       //head =  Node.insertAtEnd(head, 5);  // Insert At End
        head =  Node.insertAtIndex(head, 9, 4);  // Insert At Index




        Node.Traversal(head);









    }
}