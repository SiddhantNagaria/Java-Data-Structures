
class Print_x_to_power_n {

    //O(logn)
    public static int print_x_to_power_n(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = print_x_to_power_n(x, n / 2);
        int halfPowerSqr = halfpower * halfpower;

        // int halfPowerSqr = print_x_to_power_n(x, n / 2) * print_x_to_power_n(x, n / 2);  ==>> O(n)

        // n is odd
        if (n % 2 != 0) {
            halfPowerSqr = x * halfPowerSqr;
        }

        return halfPowerSqr;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println("x to the power of n is: " + print_x_to_power_n(x, n));
    }
}
