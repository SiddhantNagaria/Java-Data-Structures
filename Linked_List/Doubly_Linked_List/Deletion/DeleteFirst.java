class DeleteFirst {
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
    void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head != null) {
            Node temp = head;
            head = head.next;
            temp = null;
            if (head != null) {
                head.prev = null;
            }
        }
    }
}
