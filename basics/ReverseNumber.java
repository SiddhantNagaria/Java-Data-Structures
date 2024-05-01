import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int no, rev = 0 , r ,a;
        System.out.println("Enter the number");
        Scanner sc=new Scanner (System.in);
        no=sc.nextInt();
        a = no;
        while(no > 0){
            r = no % 10;
            rev =rev * 10 +r ;
            no /= 10;
        }
        System.out.println("reverse is " + rev);
    }
}
