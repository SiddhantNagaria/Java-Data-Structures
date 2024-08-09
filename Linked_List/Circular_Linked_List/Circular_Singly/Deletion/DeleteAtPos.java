class DeleteAtPos {
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

    public void DeleteAtPos(int pos) {
        Node nodeToDelete = head;
        Node temp = head;
        int noOfELem = 0;
        if (temp != null) {
            noOfELem++;
            temp = temp.next;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        if (pos < 1 || pos > noOfELem) {
            System.out.println("invalid position");
        } else if (pos == 1) {
            if (head.next == head) {
                head = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
                nodeToDelete = null;
            }
        } else {
            temp = head;
            for (int i = 1; i < pos - 1; i += 1) {
                temp = temp.next;
            }
            nodeToDelete = temp.next;
            temp.next = temp.next.next;
            nodeToDelete = null;
        }
    }
}
