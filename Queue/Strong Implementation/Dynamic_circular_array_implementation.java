

class Dynamic_circular_array_implementation{
    //array to implement queue
    private int[] A;

    private int size, front, rear;

    //length of array to implement the queue
    private static int CAPACITY = 16; //default queue size
    public static int MINCAPACITY = 1<<15; //power of 2

    //initialize queue to use array of default length
    public Dynamic_circular_array_implementation(int cap){
        A = new int[cap];
        size=0; front =0; rear =0;
    }

    //insert at rear of queue
    public void enQUeue (int data) throws NullPointerException, IllegalStateException{
        if(size==CAPACITY){
            expand();
        }
        size++;
        A[rear]=data;
        rear = (rear+1)%CAPACITY;
    }
    
    //remove from front
    public int deQueue() throws IllegalStateException{
        //effects: if queue is empty, throw illegalStateException
        //else remove and return oldest elememt of this
        if(size == 0){
            throw new IllegalStateException("Queue is empty: underflow");
        }
        else{
            size--;
            int data = A[(front%CAPACITY)];
            A[front] = Integer.MIN_VALUE;
            front = (front+1)%CAPACITY;
            return data;
        }
    }

    //check if queue is empty
    public boolean isEmpty(){
        return (size == 0);
    }

    //check if queue is full
    public boolean isFull(){
        return (size == CAPACITY);
    }

    //return number of elements of queue
    public int size(){
        return size;
    }

    //increase queue size by double
    public void expand(){
        int length = size();
        int[] newQueue = new int[length<<1]; //or 2*length
        
        //copy items
        for(int i = front; i<=rear; i++){
            newQueue[i-front] = A[i%CAPACITY];
        }
        A = newQueue;
        front = 0;
        rear = size-1;
        CAPACITY *=2;
    }

    //dynamic array operation to shrink queue to 1/2 if more than 3/4 is empty
    public void shrink(){
        int length = size;
        if(length<=MINCAPACITY || length<<2>=length){
            return;
        }
        if(length<MINCAPACITY){
            length = MINCAPACITY;
        }
        int [] newQueue = new int[length];
        System.arraycopy(A,0,newQueue,0,length+1);
        A=newQueue;
    }

    //return string representation
    public String toString(){
        String res = "[";
        for(int i = 0; i<size;i++){
            res += Integer.toString(A[(front+i) % CAPACITY ]);
            if(i<size-1){
                res+=",";
            }
        }
        res+="]";
        return res;
    }
}