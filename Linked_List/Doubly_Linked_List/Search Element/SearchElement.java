import java.util.Scanner;
class SearchElement {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static int size = 0;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void searchElementinList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int value = sc.nextInt();
        Node temp = head;
        int found = 0;
        int i = 0;
        if (temp != null) {
            while (temp != null) {
                i++;
                if (temp.data == value) {
                    found++;
                    break;
                }
                temp = temp.next;
            }
            if (found == 1) {
                System.out.println("Element found at index " + (i - 1));
            } else {
                System.out.println(value + " not found in list");
            }
        } else {
            System.out.println("List is empty");
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SearchElement s = new SearchElement();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        s.addLast(6);
        s.addLast(7);
        s.addLast(8);
        s.addLast(9);
        s.addLast(10);
        s.printList();
        s.searchElementinList();
    }
}
