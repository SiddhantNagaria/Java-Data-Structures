
import java.util.*;

class Insert_in_heap {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { //O(log n)
            //add at last index
            arr.add(data);

            int x = arr.size() - 1; //child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { //O(log n)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public void printHeap() {
            System.out.println(arr);
        }

    }

    public static void main(String[] args) {
        Heap minHeap = new Heap();
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(30);
        minHeap.add(2);

        // Print the heap
        System.out.print("Min-Heap: ");
        minHeap.printHeap();
    }
}
