public class SumOfTwoMatrices {
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4}};
        int b[][]={{5,6},{7,8}};
        int c[][]= new int[2][2];
        int i ,j;
        for (i = 0 ; i < 2 ; i++) {
            for(j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for (i = 0 ; i < 2 ; i++) {
            for(j=0;j<2;j++){
               System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
   }
}
