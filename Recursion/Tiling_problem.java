class Tiling_problem{

    public static int tilingProblem(int n){
       if(n==0 || n==1){
           return 1;
       }
        //vertical
        int fnm1 = tilingProblem(n-1);

        //horizontal
        int fnm2 = tilingProblem(n-2);
        
        //total
        int total = fnm1 + fnm2;
        return total;
        //return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        int n = 4;
        int result = tilingProblem(n);
        System.out.println("Total ways to tile a " + n + "x" + n + " grid are: " + result);
    }
}