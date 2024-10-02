
import java.util.EmptyStackException;

public class Stack_Using_Linked_List<T> {

    static class ListNode {

        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private int Length;
    private ListNode top;

    public Stack_Using_Linked_List() {
        Length = 0;
        top = null;
    }

    //push
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        Length++;
    }

    //remove top 
    public int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        Length--;
        return result;
    }

    //peek
    public int peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    //return if empty
    public boolean isEmpty() {
        return (Length == 0);
    }

    //return number of elements
    public int size() {
        return Length;
    }

    //return string representation
    public String toString() {
        String result = "";
        ListNode Current = top;
        while (Current != null) {
            result += Current.toString() + "\n";
            Current = Current.next;
        }
        return result;
    }

}
