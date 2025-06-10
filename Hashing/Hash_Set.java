import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet <Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        if(set.contains(2)){
            System.out.println("set contains");
        }
        if(set.contains(3)){
            System.out.println("set contains");
        }

        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
