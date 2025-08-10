class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }


}
class Stack{
    Node top;

    public void push(int data){

        Node newNode = new Node(data);

        if (top == null){
          top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop(){
        if (top == null){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        else {

            Node curr = top;
            top = top.next;
            return curr.data;
        }
    }

    public int peek()
    {
        if(top==null)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            return top.data;
        }
    }

}

public class Main {
    public static void main(String[] args) {


        Stack obj = new Stack();
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(6);



        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());



    }
}