class Circular_Queue_using_Linked_List{
    static class Node{
        int data;
        Node link;
    }


    static class Queue{
        Node front;
        Node rear;
    }


    static void enque(Queue q, int value){
        Node temp = new Node();
        temp.data = value;
        if(q.front==null){
            q.front = temp;
        }else{
            q.rear.link = q.front;
        }
    }


    static int dequeue(Queue q){
        if(q.front == null){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int value;
            if(q.front ==q.rear){
                value = q.front.data;
                q.front = null;
                q.rear = null;
            }else{
                Node temp = q.front;
                value = temp.data;
                q.front = q.front.link;
                q.rear.link = q.front;
            }
            return  value;
        }
    }

    static void display(Queue q){
        Node temp = q.front;
        while(temp.link!=null){
            System.out.println(temp.data + " ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;
        enque(q, 10);
        enque(q, 20);
        display(q);

    }

}