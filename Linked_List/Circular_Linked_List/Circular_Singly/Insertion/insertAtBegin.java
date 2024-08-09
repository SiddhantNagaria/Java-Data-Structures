class insertAtBegin{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode = head;
            head.next = head;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            
        }
    }
}