class DeleteLast{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void DeleteLast(){
        if (head != null) {
            if (head.next == head) {
                head = null;
            }
            else{
                Node temp = head;
                while(temp.next.next!=null){
                    temp = temp.next;
                }
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }

    }
}