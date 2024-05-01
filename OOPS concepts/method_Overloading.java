class Boy{
    String name;
    int age;
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class method_Overloading {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.displayInfo("siddhant");
        boy.displayInfo(19);
        boy.displayInfo("siddhant", 19);
    }
}
