class First_occurence_of_element_in_array{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int key = 3;
        System.out.println(firstIndex(arr, key, 0));
    }
    public static int firstIndex(int arr[], int key, int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstIndex(arr, key, i+1);
    } 
}