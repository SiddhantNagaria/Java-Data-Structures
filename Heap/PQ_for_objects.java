
import java.util.Comparator;
import java.util.PriorityQueue;

class PQ_for_objects{

    static class Student implements Comparable<Student>{ //overriding
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> q = new PriorityQueue<>(); 
        PriorityQueue<Student> q2 = new PriorityQueue<>(Comparator.reverseOrder());
        //priority will be in ascending order
        q.add(new Student("siddhant",4));
        q.add(new Student("rohan",8));//insertion order is not maintained
        q.add(new Student("rahul",3));
        while(!q.isEmpty()){
            System.out.println(q.peek().name + " ->" + q.peek().rank); ///O(1)
            q.poll(); //remove // O(log n)
        }
    }
}