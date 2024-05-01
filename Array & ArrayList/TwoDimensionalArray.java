public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] twoDimentional = new int [2][3];
        int i, j, x = 1;
        for (i=0; i < 2 ; i++){
            for( j=0; j<3;j++){
                twoDimentional[i][j]= x;
                x++;
            }
        }
        System.out.println("Two Dimensional Array:");
        for(i = 0; i<2;i++){
            for(j = 0; j<3;j++){
                System.out.print(twoDimentional[i][j] + " ");
            }
            System.out.println();
        }
    }
}
