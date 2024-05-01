class Students{
    private String name;
    private int age;
    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }
    Students(Students s){
        System.out.println("copy constructor called");
        name = s.name;
        age = s.age;
        System.out.println(name +" " + age);
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        Students s1 = new Students("Siddhant", 19);
        Students s2 = new Students(s1);
    }
}
