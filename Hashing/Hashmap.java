
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        //create a hash map
        HashMap<String, Integer> hm = new HashMap<>();

        //insert key value pair - O(1)
        hm.put("India", 100);
        hm.put("Pakistan", 200);
        hm.put("Nepal", 300);
        hm.put("Srilanka", 400);

        //get value - O(1)
        System.out.println(hm.get("India"));
        
        //cotains key - O(1)
        System.out.print(hm.containsKey("India"));
        System.out.print(hm.containsKey("Indonesia"));
        
        //remove
        System.out.print(hm.remove("India"));
        System.out.print(hm);

        //size
        System.out.println(hm.size());

        //is empty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);
    }
}
