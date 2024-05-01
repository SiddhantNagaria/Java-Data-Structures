class Student{
    String name;
    int age;
    public void getInfo(){
        System.out.println("the name of this student is " + this.name);
        System.out.println("the age of this student is " + this.age);
    }
}

public class oops_example1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "siddhant";
        s1.age = 19;
        s1.getInfo();
        Student s2 = new Student();
        s2.name = "rohan";
        s2.age = 19;
        s2.getInfo();
    }
}
