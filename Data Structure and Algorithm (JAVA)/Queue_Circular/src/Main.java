class CircularQueue{

    int size;
    int front;
    int rear;
    int[] arr;

    CircularQueue(int size){
        this.size = size;
        front = rear = 0;
        arr = new int[size];
    }

    boolean isEmpty(){
        return rear == front;
    }
    boolean isFull(){
        return (rear + 1) % size == front;  // Circular Increment Full Condition
    }


    public void enQueue(int val){
        if (isFull()){
            System.out.println("Queue OverFlow");
        }
        else {
            rear = (rear +1) % size;  // Circular Increment
            int a = arr[rear] = val;
            System.out.println("EnQueued Element: " + a );
        }
    }

    public int deQueue(){
        int val = -1;
        if (isEmpty()){
            System.out.println("No Element to deQueue ");
        }
        else {
            front = (front + 1) % size;  // Circular Increment
            val  = arr[front];
        }
        return val;
    }

}
public class Main {
    public static void main(String[] args) {

        CircularQueue obj = new CircularQueue(5);

        obj.enQueue(4);
        obj.enQueue(5);
        obj.enQueue(6);
        obj.enQueue(7);
        obj.enQueue(8);
      //  obj.enQueue(8); // Can't enQueue Cuz of Queue is Full



        System.out.println("DeQueued Element: " + obj.deQueue()); // OutPut : 4 Cuz Queue Follow FIFO Discipline
        System.out.println("DeQueued Element: " + obj.deQueue());
                       // Now Space is Available so we can EnQueue

        obj.enQueue(21);
        obj.enQueue(10);

        obj.enQueue(5);



    }
}