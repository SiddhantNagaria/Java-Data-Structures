
public class CircularSinglyLL {

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
    protected Node tail;
    protected int length;

    public CircularSinglyLL() {
        tail = null;
        length = 0;
    }

    //adds data to beginning of list.
    public void add(int data) {
        addToHead(data);
    }

    //add element to headof list
    public void addToHead(int data) {
        Node temp = new Node(data);
        if (tail == null) {
            tail = temp;
            tail.next = tail;
        } else {
            temp.next = tail.next;
            tail.next = temp;
        }
        length++;
    }

    //adds element to tail of list
    public void addToTail(int data) {
        addToHead(data);
        tail = tail.next;
    }

    //return data at head of list
    public int peek() {
        return tail.data;
    }

    public int tailPeek() {
        return tail.data;
    }

    //returns and removes data from head of list
    public int removeFromHead() {
        Node temp = tail.next;
        if (tail == tail.next) {
            tail = null;
        } else {
            tail.next = temp.next;
            temp.next = null;
        }
        length--;
        return temp.data;
    }

    //returns and removes data from tail of list
    public int removeFromTail() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        Node finger = tail;
        while (finger.next != tail) {
            finger = finger.next;
        }
        Node temp = tail;
        if (finger == tail) {
            tail = null;
        }
        length--;
        return temp.data;
    }

    //returns true if list contains data, else false
    public boolean contains(int data) {
        if (tail == null) {
            return false;
        }
        Node finger = tail.next;
        while (finger != tail && (!(finger.data == data))) {
            finger = finger.next;
        }
        return finger.data == data;
    }

    //removes and returns element equal to data , or null
    public int remove(int data) {
        if (tail == null) {
            return Integer.MIN_VALUE;
        }
        Node finger = tail.next;
        Node prev = tail;
        int compares;
        for (compares = 0; compares < length && (!(finger.data == data)); compares++) {
            prev = finger;
            finger = finger.next;
        }
        if (finger.data == data) {
            //an example of the pigeon-hole principle
            if (tail == tail.next) {
                tail = null;
            } else {
                if (finger == tail) {
                    tail = prev;
                }
                prev.next = prev.next.next;
            }
            finger.next = null;
            length--;
            return finger.data;
        } else {
            return Integer.MIN_VALUE;
        }
    }
    
    //return length of CLL
    public int length(){
        return length;
    }

    //returns true if no elements in the list
    public boolean isEmpty(){
        return tail == null;
    }

    //remove everything from CLL
    public void clear(){
        length = 0;
        tail = null;
    }
    
    //return string representation
    public String toString(){
        String result = "[";
        if(tail==null){
            return result + "]";
        }
        result = result + tail.data;
        Node temp = tail.next;
        while(temp!=tail){
            result = result + "," + temp.data;
            temp = temp.next;
        }
        return result + "]";
    }
}
