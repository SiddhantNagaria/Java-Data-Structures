class deleteLastNode {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteLast() {
        if (this.head == null) {
            System.out.println("List is empty");
        }
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        deleteLastNode list = new deleteLastNode();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printlist();
        list.deleteLast();
        list.printlist();
    }
}
