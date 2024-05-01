import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a , b, c;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a " );
        a = sc.nextInt();
        System.out.println ("Enter Value Of B");
        b=sc.nextInt ();
        c =a ;
        a = b;
        b = c;
        System.out.println("new value of a is " + a);
        System.out.println("new value of b is " + b);
    }
}
