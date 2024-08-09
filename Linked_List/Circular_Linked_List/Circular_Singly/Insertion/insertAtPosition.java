
class insertAtPosition {

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

    void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);
        Node temp = head;
        int NoData = 0;
        if (temp != null) {
            NoData++;
            temp = temp.next;
        }
        while (temp != head) {
            NoData++;
            temp = temp.next;
        }
        if (pos < 1 || pos > (NoData + 1)) {
            System.out.println("Invalid Position");
        }
        else if(pos == 1){
            if(head == null){
                head = newNode;
                head.next = head;
            }
            else{
                while(temp.next!=null){
                    temp = temp.next;
                }
                newNode.next = head;
                head = newNode;
                temp.next = head;
            }
        }
        else{
            temp = head;
            for(int i = 1; i<pos-1;i+=1){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
}
