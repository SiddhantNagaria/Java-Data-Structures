class Check_if_Array_is_Sorted{
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){ // n=5, i=4 :: 5-1 = 4 == 4
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.err.println(isSorted(arr, 0));
    }
}