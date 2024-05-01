public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(str3);
        String str4 = str1.concat(str2);
        System.out.println(str4);
        String str5 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str5);
    }
}
