
import java.util.HashMap;
import java.util.Set;

public class Iteration_on_Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Pakistan", 200);
        hm.put("Nepal", 300);
        hm.put("Srilanka", 400);

        //iterate - way 1
        for (String key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }

        //iterate - way 2
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}
