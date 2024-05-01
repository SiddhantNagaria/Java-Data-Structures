public class patternQ_20 {
    // pattern
// It is not important for exam point of view
    public static void main(String[] args) {
        int n=5;
        for(int i=5;i>=0;i--){
            for(int k=0;k<n-i;k++){
                    System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


