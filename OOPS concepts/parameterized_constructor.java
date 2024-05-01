class Studentt{
    String name;
    int age;
    public Studentt(String n, int i){
        this.name = n;
        this.age = i;
    }
    void display(){
        System.out.println(name + " " + age);
    }

}

public class parameterized_constructor {
    public static void main(String[] args) {
        Studentt s1 = new Studentt("siddhant", 19);
        s1.display();
    }
}
