
import java.util.PriorityQueue;

class Remove_from_heap{

    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println("Before removal: " + pq);
        pq.remove(30);
        System.out.println("After removal: " + pq);
    }
}