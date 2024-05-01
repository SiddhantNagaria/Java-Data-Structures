abstract class Animal{
    abstract void walk();
    void breathe(){
        System.out.println("this animal breathe air");
    }
    Animal(){
        System.out.println("you're about to create an animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("you created a horse");
    }
    void walk(){
        System.out.println("horse walk on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("you created a chicken");
    }
    void walk(){
        System.out.println("chicken walk on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Chicken chick = new Chicken();
        horse.walk();
        horse.breathe();
        chick.breathe();
        chick.walk();
    }
}
