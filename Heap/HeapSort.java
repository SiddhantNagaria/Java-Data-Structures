public class HeapSort {

    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxidx = i;
        if (left < size && arr[left] > arr[maxidx]) {
            maxidx = left;
        }
        if (right < size && arr[right] > arr[maxidx]) {
            maxidx = right;
        }
        if (maxidx != i) {
            int temp = arr[maxidx];
            arr[maxidx] = arr[i];
            arr[i] = temp;
            heapify(arr,maxidx, size);
        }
    }

    public static void heapsort(int arr[]) {
        // step1 build maxheap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // step2 - push largest at end
        for (int i = n - 1; i > 0; i--) {
            // swap (largest-first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 17, 10, 84, 19, 6, 22, 9 };
        heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
