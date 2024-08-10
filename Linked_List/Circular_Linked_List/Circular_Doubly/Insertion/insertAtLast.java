public class insertAtLast {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        newNode.prev = null;
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node last = head.prev;
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = last;
            last.next = newNode;
        }
    }
}
