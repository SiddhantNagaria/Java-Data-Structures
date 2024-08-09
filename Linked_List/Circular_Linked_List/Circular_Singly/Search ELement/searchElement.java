class searchElement{
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    void searchElement(int data){
        Node temp = head;
        int found = 0;
        int i = 0;
        if(temp!=null){
            while(true){
                i++;
                if(temp.data == data){
                    found++;
                    System.out.println("Element found at position " + i);
                    break;
                }
                temp = temp.next;
                if(temp==head){
                    break;
                }
            }
            if(found==1){
                System.out.println("Element found at index " + i);
            }
            else{
                System.out.println("Element not found");
            }
        }
        else{
            System.out.println("List is empty");
        }
    }
}