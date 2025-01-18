
import java.util.Scanner;


class Remove_duplicates_in_a_String{
    
    public static void removeDuplicates(String str, int idx , StringBuilder sb, boolean map[]){
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, sb, map);
        }else{
            //not duplicate
            map[currChar - 'a'] = true;
            sb.append(currChar);
            removeDuplicates(str, idx+1, sb, map);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]); //(26, sb, map);
    }
}
