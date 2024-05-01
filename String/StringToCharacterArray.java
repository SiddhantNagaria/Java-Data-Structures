public class StringToCharacterArray {
    public static void main(String[] args) {
        String str = " HelloWorld";
        char [] stringArray;
        stringArray = str.toCharArray();
        for(int index = 0; index<stringArray.length; index++){
            System.out.println("Index: "+index+" Value:"+ stringArray[index]);
        }
    }
}
