import java.util.ArrayList;
public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayListSearch arrayList = new ArrayListSearch();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");

        boolean blnFound = arrayList.contains("2");
        System.out.println("arraylist contains 2 ?" + blnFound);

        int index = arrayList.indexOf("4");
        if(index == -1){
            System.out.println("does not contains");
        }
        else{
            System.out.println("contains at index = " + index);
        }

        int lastIndex = arrayList.lastIndexOf("3");
        if(index == -1 ){
            System.out.println("does not found");
        }
        else{
            System.out.println("last occurence of 3 is " + lastIndex);
        }
    }
}
