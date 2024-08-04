
public class DeleteAtPosition {

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
    static Node head;

    void DeleteAtPosition(int position) {
        if (position < 1) {
            System.out.println("position must be >=1");
        } else if (position == 1 && head != null) {
            Node Nodetodelete = head;
            head = head.next;
            Nodetodelete = null;
            if (head != null) {
                head.prev = null;
            }
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null && temp.next != null) {
                Node Nodetodelete = temp.next;
                temp.next = temp.next.next;
                if (temp.next.next != null) {
                    temp.next.next.prev = temp.next;
                    Nodetodelete = null;
                }
                else{
                    System.err.println("the node is null");
                }
            }
        }
    }
}
