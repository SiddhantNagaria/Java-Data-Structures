class Circular_Queue{
    static private int front, rear, capacity;
    static private int queue[];
    Circular_Queue(int c){
        front = rear = -1;
        capacity = c;
        queue = new int[capacity];
    }


    //is queue full
    public static boolean isFull(){
        return (rear+1)%capacity == front;
    }


    //is queue empty
    public static boolean isEmpty(){
        return rear== -1 && front == -1;
    }


    //insert
    static void Enque(int data){
        if(isFull()){
            System.out.println("queue overflow");
            return;
        }
        else{
            if(front == -1 && rear == -1){
                front = rear = 0;
            }else if(rear== capacity -1 && front!=0){
                rear=0;
            }else{
                rear = (rear+1)%capacity;
            }
            queue[rear]=data;
        }
    }


    //delete
    static void Dequeue(){
        if(isEmpty()){
            System.out.print("Queue underflow");
            return;
        }
        else{
            System.out.println("deleted data is " + queue[front]);
            if(front==rear){
                front = rear = -1;
            }else if(front == (capacity -1)){
                front = 0;
            }else{
                front = front + 1;
            }
        }
    }


    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue empty");
        }
        return queue[front];
    }
}
public class Circular_Queue_using_Array{
    public static void main(String[] args) {
        Circular_Queue q = new Circular_Queue(3);
        q.Enque(1);
        q.Enque(2);
        q.Enque(3);
        q.Enque(5);
        //1 2 3
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();
        }
    }
}