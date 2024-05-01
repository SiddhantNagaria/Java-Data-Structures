import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListToStringArray {
    public static void main(String[] args) {
        ArrayList <String> ListDays = new ArrayList<String>();
        ListDays.add("Sunday");
        ListDays.add("Monday");

        Object[] objDays = ListDays.toArray();
        String [ ] strDays = Arrays.copyOf(objDays, objDays.length, String[].class);

        for(int i = 0; i < strDays.length; i++){
            System.out.println(strDays[i]);
        }
    }
}
