public class SumOf2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8}};
        int i , j , sum =0;
        for(i=0; i<2;i++){
            for(j = 0; j<4;j++){
                sum+=arr[i][j];
            }
        }
        
        System.out.println(sum);
    }
}
