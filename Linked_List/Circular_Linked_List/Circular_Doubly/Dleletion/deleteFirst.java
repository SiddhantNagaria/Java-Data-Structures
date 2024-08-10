
class deleteFirst {

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

    void deleteFirst() {
        if (head != null) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                Node firstNode = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                head.prev = temp;
                temp.next = head;
                firstNode = null;
            }
        }
    }
}
