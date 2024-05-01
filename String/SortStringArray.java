import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] str = { "Abc", "def", "RuI", "asd"};
        Arrays.sort(str);
        for(int i = 0; i <str.length; i++){
            System.out.println(str[i] + " ") ;
        } 
        Arrays.sort(str);
        for(int i  = 0 ; i < str.length; i++){
            System.out.println(str[i] + " ");
        }
    }
}
