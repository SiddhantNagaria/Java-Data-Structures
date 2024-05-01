public class ArrangeArrayInAscendingOrder {
    public static void main(String[] args) {
        int i , temp,j;
        int a[]= {1,5,3,6,2,9,7,4};
        for(i=0;i<a.length;i++){
            for(j = i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    //swap the values of two elements
                    // in array
                    // we can swap by using temporary variable and then assigning value to original element
                    // or directly swapping the values
                    // of ith index with jth index
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
