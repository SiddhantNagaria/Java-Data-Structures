class Shape3{
    public void area(){
        System.out.println("display area of shape");
    }
}
class Square extends Shape3{
    public void area(int l){
        System.out.println(l*l);
    }
}

class rhombus extends Square{
    public void area(int a, int b){
        System.out.println(0.5*a*b);
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Square s = new Square();
        rhombus r = new rhombus();
        r.area();
        s.area();
        s.area(10);
        r.area(2,3);
    }
}
