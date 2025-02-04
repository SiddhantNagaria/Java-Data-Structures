
import java.util.PriorityQueue;

class Priority_Queue_using_JCF{
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(); //ArrayDeque
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //priority will be in ascending order
        q.add(1); //O(log n)
        q.add(2);
        q.add(6);
        q.add(4);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek()); ///O(1)
            q.poll(); //remove // O(log n)
        }
    }
}