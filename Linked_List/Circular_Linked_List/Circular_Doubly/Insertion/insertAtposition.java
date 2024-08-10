
class insertAtposition {

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

    public void insertAtposition(int data, int pos) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = head;
        int Elements = 0;
        if (temp != null) {
            Elements++;
            temp = temp.next;
        }
        while (temp != null) {
            Elements++;
            temp = temp.next;
        }
        if (pos < 1 || pos > (Elements + 1)) {
            System.out.println("Invalid position");
        } else if (pos == 1) {
            if (head == null) {
                head = newNode;
                head.next = head;
                head.prev = head;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;
                newNode.prev = newNode;
                head = newNode;
            }
        }
        else{
            temp = head;
            for(int i = 1; i <pos -1; i+=1){
                temp = temp.next;   
            }
            newNode.next = temp.next;
            newNode.next.prev = newNode;
            newNode.prev= temp;
            temp.next = newNode;
        }
    }
}
