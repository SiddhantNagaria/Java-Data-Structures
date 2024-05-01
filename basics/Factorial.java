public class Factorial {
    // public static void main(String[] args) {
    //     int fact = 1 , i , num = 5;;
    //     for( i = 1 ; i<=num; i++){
    //         fact*=i;
    //     }
    //     System.out.println("Factorial of "+num+" is :"+fact);
    // }

    public long factorial(long num){
        if(num<=1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        for(int counter = 0; counter<=10; counter++)
        System.out.printf("%d!=%d\n",counter, f.factorial(counter) );
    }
}
