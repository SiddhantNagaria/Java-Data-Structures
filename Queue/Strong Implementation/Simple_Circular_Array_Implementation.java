import java.lang.*;

class Simple_Circular_Array_Implementation{
    //array to implement the queue
    private int[] A;

    private int size, front, rear;

    //length of array to implement queue
    private static final int CAPACITY = 16;

    //initialize queue to use array of default length
    public Simple_Circular_Array_Implementation(){
        A = new int[CAPACITY];
        size = 0; front = 0; rear = 0;
    }

    //initialize queue to use array of given length
    public Simple_Circular_Array_Implementation(int cap){
        A = new int[cap];
        size = 0; front=0; rear=0;
    }

    //insert element at rear
    public void enqueue(int data) throws NullPointerException, IllegalStateException{
        if(size == CAPACITY){
            throw new IllegalStateException("Queue is full");
        }
        else{
            size++;
            A[rear] = data;
            rear=(rear+1)%CAPACITY;
        }
    }

    //remove front element
    public int dequeue() throws IllegalStateException{
        //Effect: if queue is empty, throw illegal state exception
        //else remove and return oldest element of this
        if(size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        else{
            size--;
            int temp = A[front % CAPACITY];
            A[front] = Integer.MIN_VALUE;
            front = (front + 1) % CAPACITY;
            return temp;
        }
    }

    //check queue is empty
    public boolean isEmpty(){
        return (size == 0);
    }

    //check queue is full
    public boolean isFull(){
        return (size == CAPACITY);
    }

    
}