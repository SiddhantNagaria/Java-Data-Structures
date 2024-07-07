

class deleteFirst{
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

    public void DeleteFirst(){
        if(this.head!=null){
            Node temp = this.head;
            this.head = this.head.next;
            temp = null;
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
        deleteFirst list = new deleteFirst();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printlist();
        list.DeleteFirst();
        list.printlist();
    }
}