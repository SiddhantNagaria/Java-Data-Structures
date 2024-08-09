class insertAtLast{
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

    public void insertAtlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = head;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            newNode.prev = temp;
        }
    }
}