
class Node {

    int data;
    Node next;
    Node prev;
}

class deleteLast {

    Node head;

    public deleteLast() {
        head = null;
    }

    void deleteLast() {
        if (head != null) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next.next != head) {
                    temp = temp.next;
                }
                Node lastNode = temp.next;
                temp.next = head;
                head.prev = temp;
                lastNode = null;
            }
        }
    }
}
