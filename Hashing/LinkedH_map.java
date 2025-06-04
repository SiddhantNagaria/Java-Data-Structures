import java.util.*;

public class LinkedH_map {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 500);
        lhm.put("America", 200);
        System.out.println(lhm);

        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 30);
        hm.put("Brazul", 50);
        hm.put("argentina",10);
        System.out.println(hm);
    }
}
