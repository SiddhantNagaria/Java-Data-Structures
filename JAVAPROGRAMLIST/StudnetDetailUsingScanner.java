import java.util.Scanner;
 
public class StudnetDetailUsingScanner{
      public static void main(String args[]){
          String name;
          int roll;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
      }
}
