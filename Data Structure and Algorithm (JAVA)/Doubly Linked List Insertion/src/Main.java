class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    static void Traversal(Node head){

        int count = 0;
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
            count++;
        }
        System.out.println("Count: "  + count);
    }

    static void reverseTraversal(Node head){
        // Move to the Last Node
        while (head.next!=null){
            head = head.next;
        }
        System.out.println("Reversed Linked List");
        while (head != null)
        {
            System.out.println(head.data);
            head = head.prev;
        }
    }

    static Node insertAtFirst(Node head, int data){

        Node curr = new Node(data);
        curr.next = head;
        head = curr;
        curr.prev = null;

        return head;
    }
    static Node insertAtEnd(Node head, int data){
        Node curr = new Node(data);
        Node ptr = head;
        while (ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next = curr;
        curr.prev = ptr;
        curr.next = null;

        return head;
    }

    static Node insertAtIndex(Node head, int data, int index){
        Node curr = new Node(data);
        int count= 0;
        Node ptr = head;


        while (count < index-1){
            ptr = ptr.next;
            count++;
        }

        curr.next = ptr.next;
        ptr.next = curr;
        curr.prev = ptr;
        
        return head;
    }



}

public class Main {
    public static void main(String[] args) {

        // Other Operations will not change like Update , Insertion etc
        Node head = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        Node p5 = new Node(50);
        Node p6 = new Node(60);

        head.prev = null;
        head.next = p2;

        p2.prev = head;
        p2.next = p3;

        p3.prev = p2;
        p3.next = p4;

        p4.prev = p3;
        p4.next = p5;

        p5.prev = p4;
        p5.next = p6;

        p6.prev = p5;
        p6.next = null;

        Node.Traversal(head);


       // head = Node.insertAtFirst(head, 7);
       // head = Node.insertAtEnd(head, 5);
         head = Node.insertAtIndex(head, 4, 3);

        Node.Traversal(head);

       // System.out.println(" \n");
      //  Node.reverseTraversal(head);  Reverse Print





/*
                      Insert at start or end is same

                        Insert At Index or position

                        Logic

                        Node n = new Node(data)  // new node to be inert

                       n.next = curr
                       n.prev = curr.prev
                       curr.prev.next = n
                       c.prev = n

                      Delete at start or end is same

                      Delete at index or position


                      Logic

                      curr.prev.next = curr.next
                      curr.next,prev = curr.prev

                               */



    }
}