import java.util.*;
public class Bodmas{
	public int sum(int a, int b){
		return a + b;	
	}
	public int multiply(int a, int b){
		return a*b;
	}
	public int difference(int a , int b){
		return a-b;
	}
	public int division(int a , int b){
		return a/b;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Bodmas obj = new Bodmas();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result1 = obj.sum(a,b);
		int result2 = obj.multiply(a,b);
		int result3 = obj.difference(a,b);
		int result4 = obj.division(a,b);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}
}