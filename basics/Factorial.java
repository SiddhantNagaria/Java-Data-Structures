public class Factorial {
    public static void main(String[] args) {
        int fact = 1 , i , num = 5;;
        for( i = 1 ; i<=num; i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is :"+fact);
    }
}
