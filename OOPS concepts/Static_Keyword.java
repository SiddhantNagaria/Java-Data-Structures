class A{
    static String school;
    String name;
}

public class Static_Keyword {
    public static void main(String args[]){
        A.school = "GlA";
        A a1 = new A();
        A a2 = new A();
        a1.name = "balveer";
        a2.name = " beena";
        System.out.println(a1.school);
        System.out.println(a2.name);
    }

}
