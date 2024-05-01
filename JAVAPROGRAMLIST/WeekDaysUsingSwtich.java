import java.util.Scanner;

public class WeekDaysUsingSwtich {
    public static void main(String args[]) {
        System.out.println("Week Days");
        System.out.println("Enter your colour choice: ");
        Scanner in = new Scanner(System.in);
        char choice = in.next().charAt(0);
        switch (choice) {
            case 'M':
                System.out.println("monday");
                break;
                
            case 'T':
                System.out.println("tuesday");
                break;
                
            case 'W':
                System.out.println("wednesday");
                break;
                
           case 'U':
                System.out.println("thursday");
                break;
                
           case 'F':
                System.out.println("friday");
                break;
                
           case 'S':
                System.out.println("saturday");
                break;
                
           case 'N':
                System.out.println("Sunday");
                break;
                
           default:
                System.out.println("Incorrect choice");
        }
    }
}
