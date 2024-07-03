public class InsertAtBegin{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void main(String args[]){
        InsertAtBegin list = new InsertAtBegin();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
    }
}