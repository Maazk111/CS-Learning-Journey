class Node {
    int data;
    Node next; // user Define Data type

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public static boolean Search(Node head , int key){
        Node curr = head;
        while (curr!=null){
            if(curr.data== key){
                return true;

            }
         curr = curr.next;

        }
        return false;
    }

    public static boolean Update(Node head , int key, int updateVal){
        Node curr = head;
        while (curr!=null){
            if(curr.data== key){

                curr.data = updateVal;
                System.out.printf("Updated SuccessFully %d\n", curr.data );
                return true;

            }
            curr = curr.next;

        }
        return false;
    }

 static void Traversal(Node p1){

       while (p1!=null){
           System.out.println(p1.data);
           p1 = p1.next;
       }
    }


}
public class Main {
    public static void main(String[] args) {



        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
      //  System.out.println(p1.next);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        Node.Traversal(p1);

        System.out.println(Node.Search(p1,p2.data));
        System.out.println(Node.Update(p1,p2.data,5 ));
        Node.Traversal(p1);




    }
}