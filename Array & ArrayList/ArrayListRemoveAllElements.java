import java.util.ArrayList;
public class ArrayListRemoveAllElements {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        System.out.println("size of arrayList before remocving is " + arrayList.size());

        arrayList.clear();
        System.out.println("size of arraylist after removing elements is " + arrayList.size());
    }
}
