
import java.util.Stack;

public class Duplicate_Parentheses{
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while( s.peek()!='('){ //!s.isEmpty() &&
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate
                }
                else{
                    s.pop(); //opening pair
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //valid string
        String str1 = "((a+b))"; //true its a duplicate parentheses
        String str2 = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str2));
    }
}