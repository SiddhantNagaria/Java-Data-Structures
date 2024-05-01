class Student1{
    String name;
    int age;
    Student1(){
        System.out.println("constructor called");
    }
}

public class non_parameterized_constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

    }
}

