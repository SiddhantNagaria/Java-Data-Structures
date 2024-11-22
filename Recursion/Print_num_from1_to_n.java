
class Print_num_from1_to_n {

    public static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        print(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
