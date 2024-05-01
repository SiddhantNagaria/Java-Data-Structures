public class StringSplit {
    public static void main(String[] args) {
        String str = "one-two-three";
        String[] temp;
        String deliminater = "-";
        temp = str.split(deliminater);
        for(int i = 0; i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println("");
        temp = str.split(deliminater,2);
        for(int i = 0; i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
