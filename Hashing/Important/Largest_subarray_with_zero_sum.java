
import java.util.HashMap;

public class Largest_subarray_with_zero_sum {
    public static void main(String[] args) {
        // brute force - Nested loops - O(n^2)
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
            }
        }
        System.out.println(maxLen);

        //using hashmap - O(n)
         HashMap<Integer, Integer> map = new HashMap<>();
         //(sum, idx)
         int sum = 0;
         int len = 0;
         for(int j =0; j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len, j-map.get(sum));
            }else{
                map.put(sum,j);
            }
         }
         System.out.println(len);
    }

}
