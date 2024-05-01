class Node {
    int data;
    Node next;

}

class LL {
    Node head;

    LL() {
        head = null;
    }

    void InsertAtBegin(int newData) {
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = head;
        head = newNode;
    }

    void InsertAtLast(int newData) {
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    void InsertAtPosition(int newData, int pos) {
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = null;
        if (pos < 1) {
            System.out.println("enter valid position");
        } else if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            for (int i = 1; i < pos - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;

            } else {
                System.out.println("the previous node is null");
            }
        }
    }

    void SearchElement(int searchValue) {
        Node temp = new Node();
        temp = this.head;
        int found = 0;
        int i = 0;
        if (temp != null) {
            while (temp != null) {
                i++;
                if (temp.data == searchValue) {
                    found++;
                    break;
                }
                temp = temp.next;
            }
            if (found == 1) {
                System.out.println(searchValue + " is found at index " + i);
            } else {
                System.out.println(searchValue + " is not found in list");
            }
        } else {
            System.out.println("the list is empty");
        }
    }

    void deleteFirst() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
        }
    }

    void deleteLast() {
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node temp = new Node();
                temp = this.head;
                while (temp.next.next != null)
                    temp = temp.next;
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }
    }

    void printList() {
        Node temp = new Node();
        temp = this.head;
        if (temp != null) {
            System.out.println("The list contains : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("the list is empty");
        }
    }
}

public class Linked_List {
    public static void main(String[] args) {

        //insert at start
        LL list = new LL();
        list.InsertAtBegin(10);
        list.InsertAtBegin(20);
        list.InsertAtBegin(30);
        list.InsertAtBegin(40);
        list.printList();

        // insert at end
        LL list2 = new LL();
        list2.InsertAtLast(10);
        list2.InsertAtLast(20);
        list2.InsertAtLast(30);
        list2.InsertAtLast(40);
        list2.printList();


        //insert at position
        LL list3 = new LL();
        list3.InsertAtLast(10);
        list3.InsertAtLast(20);
        list3.InsertAtLast(30);
        list3.InsertAtLast(40);
        list3.InsertAtPosition(15, 2);
        list3.InsertAtPosition(25, 4);
        list3.InsertAtPosition(35, 6);
        list3.printList();


        //Search Element
        list3.SearchElement(25);
        list3.SearchElement(10);
        list3.SearchElement(40);

        //delete first node
        LL list4 = new LL();
        list4.InsertAtLast(10);
        list4.InsertAtLast(20);
        list4.InsertAtLast(30);
        list4.InsertAtLast(40);
        list4.deleteFirst();
        list4.printList();

        // delete last node
        LL list5 = new LL();
        list5.InsertAtLast(10);
        list5.InsertAtLast(20);
        list5.InsertAtLast(30);
        list5.InsertAtLast(40);
        list.deleteLast();

    }
}
