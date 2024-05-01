public class SimpleMatrixOfArray {
    public static void main(String[] args) {
        int [][] a= new int[2][2];
        int i , j;
        a[0][0]= 10;
        a[0][1]=10;
        a[1][0] = 50;
        a[1][1] = 30;
        for(i = 0; i<2;i++){
            for(j = 0; j<2;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
