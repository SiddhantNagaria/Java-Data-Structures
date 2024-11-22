
class Fibonacci {

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;// base case
        } else {
            int fbn1 = fibonacci(n - 1);
            int fbn2 = fibonacci(n - 2);
            int fib = fbn1 + fbn2;
            return fib;// recursive case

            // return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
}
