

class SinglyLinkedListImplementation {

    static class ListNode {

        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head;
    private int length;

    public SinglyLinkedListImplementation() {
        this.head = null;
        this.length = 0;
    }

    public synchronized ListNode getHead() {
        return head;
    }

    public synchronized void insertAtBegin(ListNode node) {
        node.next = head;
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode p;
            for (p = head; p.next != null; p = p.next);
            p.next = node;
        }
        length++;
    }

    public void insert(int data, int position) {
        if (position < 0) {
            position = 0;
        }
        if (position > length) {
            position = length;
        }
        if (head == null) {
            head = new ListNode(data);
        } else if (position == 0) {
            ListNode temp = new ListNode(data);
            temp.next = head;
            head = temp;
        } else {
            ListNode temp = head;
            for (int i = 0; i < position - 1; i += 1) {
                temp = temp.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length += 1;
    }

    public synchronized ListNode removeFromBegin() {
        ListNode node = head;
        if (node != null) {
            head = head.next;
            node.next = null;
        }
        return node;
    }
    public synchronized ListNode RemoveFromLast(){
        if(head==null){
            return null;
        }
        ListNode p = head, q = null , next = head.next;
        if(next==null){
            head = null;
            return p;
        }
        while((next=p.next)!=null){
            q=p;
            p=next;
        }
        q.next = null;
        return p;
    }
    public synchronized void removeMatched(ListNode node){
        if(head==null){
            return;
        }
        if(node.equals(head)){
            head= head.next;
            return;
        }
        ListNode p = head, q = null;
        while((q= p.next)!=null){
            if(node.equals(q)){
                p.next = q.next;
                return;
            }
            p=q;
        }
    }
    public void removeFromPosition(int position){
        if(position<1){
            position = 0;
        }
        if(position>=length){
            position = length -1;
        }
        if(head==null){
            return;
        }
        if(position==0){
            head = head.next;
        }
        else{
            ListNode temp = head;
            for(int i =1; i<position;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length-=1;
    }
    public String toString(){
        String result = "[";
        if(head==null){
            return result+"]";
        }
        result = result + head.data;
        ListNode temp = head.next;
        while(temp!=null){
            result = result + "," + temp.data;
            temp = temp.next;
        }
        return result+ "]";
    }
    public int length(){
        return length;
    }
    public int getPosition(int data){
        ListNode temp = head;
        int pos = 0;
        while(temp!=null){
            if(temp.data == data){
                return pos;
            }
            pos+=1;
            temp = temp.next;
        }
        return Integer.MIN_VALUE;
    }
    public void clearList(){
        head = null;
        length = 0;
    }

}
