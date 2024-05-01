class Shape{
    public void area(){
        System.out.println("Display area of shape");
    }
}

class Triangle extends Shape{
    public void area(int h, int b){
        System.out.println(0.5*h*b);
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        t.area(4,5);
    }
}
