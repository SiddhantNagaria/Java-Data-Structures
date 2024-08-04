class DeleteLast{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
    public static Node head;

    void deleteLast(){
        if(head == null) {
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=null;
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            Node LastNode = temp.next;
            temp.next = null;
            LastNode = null;
        }
    }
}