class Queue_using_Array{
    static final int Max = 100;
    int front;
    int rear;
    int queue[] = new int[Max];
    Queue_using_Array(){
        front = -1;
        rear = -1;
    }

    //if queue is empty
    boolean isEmpty(){
        return rear == -1;
    }

    //if queue is empty
    int size(){
        return (rear -front);
    }

    //insert element in queue
    void Enque(int data){
        if(rear ==(Max-1)){
            System.err.println("Queue size limit");
        }
        else{
            rear++;
            queue[rear] = data;
            System.out.println(data + " is added to queue");
        }
    }

    //delete element
    void Dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            int x = queue[++front];
            System.out.println(x + "is deleted from queue");
        }
    }

    //find front element
    int frontElement(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        else{
            return queue[front+1];
        }
    }

    //find rear element
    int rearElement(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }else{
            return queue[rear];
        }
    }

    public static void main(String[] args) {
        Queue_using_Array queue = new Queue_using_Array();
        queue.Enque(10);
        queue.Enque(20);
        queue.Enque(30);
        queue.isEmpty();
        queue.rearElement();

    }

}