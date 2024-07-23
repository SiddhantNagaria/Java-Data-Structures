class InsertAtLast{
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    private static Node head;
    private static Node tail;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            // tail=newNode;
        }
        else{
            // tail.next=newNode;
            // newNode.prev=tail;
            // tail=newNode;
            /////////////////////////////////////
            Node temp = new Node(data);
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;            
        }
    }
}