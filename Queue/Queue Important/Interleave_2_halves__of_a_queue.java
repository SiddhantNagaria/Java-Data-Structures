import java.util.*;
class Interleave_2_halves__of_a_queue{
    public static void interleave(Queue<Integer> q ){
        Queue<Integer>firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i = 0; i<size/2;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<10;i++){
            q.add(i);
        }
        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
     