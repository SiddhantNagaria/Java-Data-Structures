
class deleteAtPos {

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

    void deleteAtPos(int pos) {
        Node nodeTodelete = head;
        Node temp = head;
        int Elem = 0;
        if (temp != null) {
            Elem++;
            temp = temp.next;
        }
        while (temp != head) {
            Elem++;
            temp = temp.next;
        }
        if (pos < 1 || pos > (Elem + 1)) {
            System.out.println("Invalid position");
        } else if (pos == 1) {
            if (head.next == head) {
                head = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
                head.prev = temp;
                nodeTodelete = null;
            }
        } else {
            temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            nodeTodelete = temp.next;
            temp.next = temp.next.next;
            temp.next.prev = temp;
            nodeTodelete = null;
        }
    }
}
