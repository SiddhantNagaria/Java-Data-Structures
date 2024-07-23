class InsertAtPosition{
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

    void InsertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position<1){
            System.out.println("Position be >=1");
        }
        if(position==1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else{
            Node temp = new Node(data);
            temp = head;
            for(int i=1;i<position-1;i++){
                if(temp!=null){
                    temp = temp.next;
                }
            }
            if(temp!=null){
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next = newNode;
                if(newNode.next!=null){
                    newNode.next.prev = newNode;
                }
                else{
                    System.out.println("the previous is null");
                }
            }
        }
    }
}