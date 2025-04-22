
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        //create a hash map
        HashMap<String, Integer> hm = new HashMap<>();

        //insert key value pair
        hm.put("India", 100);
        hm.put("Pakistan", 200);
        hm.put("Nepal", 300);
        hm.put("Srilanka", 400);

        //get value
        System.out.println(hm.get("India"));
        
        
        
    }
}
