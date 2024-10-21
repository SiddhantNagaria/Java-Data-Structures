
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Queue_reversal {

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s1 = new Stack<>();

        while (!q.isEmpty()) {
            s1.push(q.remove());
        }
        while (!s1.isEmpty()) {
            q.add(s1.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        reverse(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

}
