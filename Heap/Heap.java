
class Heap {

    public int[] arr;
    public int count; // no of elements in heap
    public int capacity;//size of heap
    public int heap_type; //maxheap or minheap

    //constructor
    public Heap(int capacity, int heap_type) {
        this.capacity = capacity;
        this.heap_type = heap_type;
        this.count = 0;
        this.arr = new int[capacity];

    }

    public int Parent(int index) {
        if (index <= 0 || index >= count) {
            System.out.println("Invalid index");
            return -1;
        }
        return (index - 1) / 2;
    }

    public int LeftChild(int index) {
        int left = 2 * index + 1;
        if (left >= count) {
            return -1;
        }
        return left;
    }

    public int rightChild(int index){
        int right = index*2 + 2;
        if(index>=count){
            return -1;
        }
        return right;
    }

    public int getMax() {
        if(this.count==0){
            return -1;
        }
        return this.arr[0];
    }

}
