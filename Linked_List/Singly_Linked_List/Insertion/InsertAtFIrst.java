public class InsertAtFIrst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;

        void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } 
            else {
                newNode.next = head;
                head = newNode;
            }
        }
        void printList(){
            Node temp = new Node(data);
            temp = this.head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            InsertAtFIrst obj = new InsertAtFIrst();
            obj.insertAtBegin(10);
            obj.insertAtBegin(20);
            obj.printList();
        }
    }
}
