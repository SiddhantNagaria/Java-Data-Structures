class Shape1{
    public void area(){

        System.out.println("display area aof shape");
    }
}
class Circle extends Shape1{
    public void area(int r){

        System.out.println(3.14*r*r);
    }
}
class Rectangle extends Shape1{
    public void area(int l, int b){
        System.out.println(2*l*b);
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        r.area();
        c.area(4);
        r.area(5,4);
    }
}
