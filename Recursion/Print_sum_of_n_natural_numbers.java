class Print_sum_of_n_natural_numbers{
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        int sum1 = sum(n-1);
        int sum2 = n + sum1;
        return sum2;

        // return n + sum(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}