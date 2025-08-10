class Queue{

    int size;
    int front;
    int rear;
    int[] arr;

    Queue(int size){
        this.size = size;
        front = rear = -1;
        arr = new int[size];
    }

    boolean isEmpty(){
        return rear == front;
    }
    boolean isFull(){
        return rear == size-1;
    }


    public void enQueue(int val){
        if (isFull()){
            System.out.println("Queue OverFlow");
        }
        else {
            int a = arr[++rear] = val;
            System.out.println("EnQueued Element: " + a);
        }
    }

    public int deQueue(){
        int a = -1;
        if (isEmpty()){
            System.out.println("No Element to deQueue ");
        }
        else {
            a  = arr[++front];
        }
        return a;
    }

}
public class Main {
    public static void main(String[] args) {

        Queue obj = new Queue(5);

        obj.enQueue(4);
        obj.enQueue(5);
        obj.enQueue(6);
        obj.enQueue(7);
        obj.enQueue(8);
        obj.enQueue(8); // Can't enQueue Cuz of Queue is Full

        System.out.println("DeQueued Element: " + obj.deQueue()); // OutPut : 4 Cuz Queue Follow FIFO Discipline
        System.out.println("DeQueued Element: " + obj.deQueue());








    }
}