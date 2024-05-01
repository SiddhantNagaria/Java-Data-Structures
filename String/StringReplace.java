public class StringReplace {
    public static void main(String[] args) {
        String str = "Hello WOrld";
        System.out.println(str.replace("H", "P"));
        System.out.println(str.replaceFirst("ello", "ola"));
        System.out.println(str.replaceAll("o", "i"));
    }
}
