class deleteAtPosition{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void deleteAtPos(int position){
        if(position<1){
            System.out.println("Invalid position");
        }
        else if(position==1 && head!=null){
            Node nodeToDelete = head;
            head= head.next;
            nodeToDelete = null;
        }
        else{
            Node temp = head;
            for(int i = 1; i<position-1; i++){
                if(temp!=null){
                    temp = temp.next;
                }
            }
            if(temp!=null && temp.next!=null){
                Node nodeToDelete = temp.next;
                temp.next = temp.next.next;
                nodeToDelete = null;
            }
            else{
                System.out.println("The node is null");
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
        deleteAtPosition list = new deleteAtPosition();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printlist();
        list.deleteAtPos(7);
        list.printlist();
    }
}