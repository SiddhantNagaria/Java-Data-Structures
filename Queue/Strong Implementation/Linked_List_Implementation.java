class Linked_List_Implementation{
    static class ListNode{
        ListNode next;
        int data;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private int length;
    private ListNode front, rear;

    //create an empty queue
    public Linked_List_Implementation(){
        length =0;
        front = rear = null;
    }

    //is Queue empty
    public boolean isEmpty(){
        return length==0;
    }

    //adds specified data to rear of queue
    public void enQueue(int data){
        ListNode node = new ListNode(data);
        if(isEmpty()){
            front = node;
        }else{
            rear.next = node;
        }
        rear = node;
        length++;
    }

    //remove data from front of queue
    public int deQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue");
        }
        int res = front.data;
        front = front.next;
        length--;
        if(isEmpty()){
            rear = null;
        }
        return res;
    }

    //reference to front element of queue
    public int first() throws Exception{
        if(isEmpty()){
            throw new Exception();
        }
        return front.data;
    }

    //return number of elements
    public int size(){
        return length;
    }

    //string representation
    public String toString(){
        String res="[";
        ListNode current = front;
        while(current!=null){
            res += res + current.toString() + "\n";
            current = current.next;
        }
        return res;
    }

}