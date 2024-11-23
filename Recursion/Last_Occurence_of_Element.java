class Last_Occurence_of_Element{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int key = 3;
        System.out.println(lastIndex(arr, key, 0));
    }
    public static int lastIndex(int arr[], int key, int index){
        if(index==arr.length){
            return -1;
        }
        int i = lastIndex(arr, key, index+1);
        if(i==-1 && arr[index]==key){
            return index;
        }
        return i;
    }
}