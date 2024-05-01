class structure{
    public void area(){
        System.out.println("display area of shape");
    }
}
class structure1 extends structure{
    public void area(int h, int b){
        System.out.println(0.5*h*b);
    }
}
class structure2 extends structure{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class method_overriding {
    public static void main(String args[]){
        structure1 s1 = new structure1();
        structure2 s2 = new structure2();
        s1.area();
        s1.area(12,13);
        s2.area(13);
    }
}
