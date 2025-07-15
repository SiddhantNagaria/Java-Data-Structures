
import java.util.HashSet;
import java.util.Iterator;

public class Iteration_on_HashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("bombay");
        cities.add("noida");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
