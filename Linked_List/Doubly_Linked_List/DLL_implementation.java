
public class DLL_implementation {

    static class DLLNode {

        int data;
        DLLNode next;
        DLLNode prev;

        public DLLNode(int data) {
            this.data = data;
        }

        private DLLNode(int MIN_VALUE, Object object, Object object0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    private DLLNode head;
    private DLLNode tail;
    private int length;

    public DLL_implementation() {
        head = new DLLNode(Integer.MIN_VALUE, null, null);
        tail = new DLLNode(Integer.MIN_VALUE, head, null);
        head.next = tail;
        length = 0;
    }

    //get value at a given position
    public int get(int position) {
        return Integer.MIN_VALUE;
    }

    //find position of the head value that is equal to a given value.
    public int getPos(int data) {
        DLLNode temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == data) {
                return pos;
            }
            pos += 1;
            temp = temp.next;
        }
        return Integer.MIN_VALUE;
    }

    public int length() {
        return length;
    }

    //insert at begin
    public void insertAtBegin(int newVal) {
        DLLNode newNode = new DLLNode(newVal, null, head.next);
        newNode.next.prev = newNode;
        head = newNode;
        length += 1;
    }

    //add value to the list at a given position
    public void insertAtPos(int data, int pos) {
        if (pos < 1) {
            pos = 0;
        }
        if (pos > length) {
            pos = length;
        }
        if (head == null) {
            head = new DLLNode(data);
            tail = head;
        } else if (pos == 0) {
            DLLNode temp = new DLLNode(data);
            temp.next = head;
            head = temp;
        } else {
            DLLNode temp = head;
            for (int i = 1; i < pos; i += 1) {
                temp = temp.next;
            }
            DLLNode newNode = new DLLNode(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
        }
        length += 1;
    }

    public void insertTail(int data) {
        DLLNode newNode = new DLLNode(data, tail.prev, tail);
        newNode.prev.next = newNode;
        tail.prev = newNode;
        length += 1;
    }

    //remove value at a given position 
    public void removeAtPos(int pos) {
        if (pos < 1) {
            pos = 1;
        }
        if (pos > length) {
            pos = length - 1;
        }
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            DLLNode temp = head;
            for (int i = 1; i < pos; i += 1) {
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
        length -= 1;
    }

    //remove a node matching the specified node from the list.
    //use equals() instead of == to test for a matched node.
    public synchronized void removeMatched(DLLNode node) {
        if (head == null) {
            return;
        }
        if (node.equals(head)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        DLLNode p = head;
        while (p != null) {
            if (node.equals(p)) {
                p.prev.next = p.next;
                p.next.prev = p.prev;
                return;
            }
        }
    }

    //remove head
    public int removeHead() {
        if (length == 0) {
            return Integer.MIN_VALUE;
        }
        DLLNode save = head.next;
        head.next = save.next;
        save.next.prev = head;
        length -= 1;
        return save.data;
    }

    //remove tail
    public int removeTail() {
        if (length == 0) {
            return Integer.MIN_VALUE;
        }
        DLLNode save = tail.prev;
        tail.prev = save.prev;
        save.prev.next = tail;
        length -= 1;
        return save.data;
    }

    //return string representation
    public String toString() {
        String res = "[]";
        if (length == 0) {
            return res;
        }
        res = "[" + head.next.data;
        DLLNode temp = head.next.next;
        while (temp != tail) {
            res += "," + temp.data;
            temp = temp.next;
        }
        return res + "]";
    }

    //remove everything - clear the list
    public void clearList() {
        head = null;
        tail = null;
        length = 0;
    }

}
