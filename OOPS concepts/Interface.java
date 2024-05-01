interface Animals{
    void walk();
}

class Horses implements Animals{
    public void walk(){
        System.out.println("horse walks on 4 legs");
    }
}

class Chickens implements Animals{
    public void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}
public class Interface {
    public static void main(String args[]){
        Horses h = new Horses();
        Chickens c = new Chickens();
        h.walk();
        c.walk();
    }
}
