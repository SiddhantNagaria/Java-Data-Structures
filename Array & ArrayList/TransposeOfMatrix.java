public class TransposeOfMatrix {
    public static void main(String[] args) {
        int a[][] = { { 2, 3 },
                { 4, 5 }
        };
        int i, j;
        int[][] b = new int[2][2];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("transpose of matrix is ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " " );
            }
            System.out.println();
        }
    }
}
