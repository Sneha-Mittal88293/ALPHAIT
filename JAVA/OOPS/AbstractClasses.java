import java.util.*;

class AbstractClasses{
    public static void main(String args[]){
       Horse h = new Horse();
       h.eat();
       h.walk();
       System.out.println(h.color);

       Chicken c = new Chicken();
       c.eat();
       c.walk();
    }
}

abstract class Animals{
    String color;

    Animals(){
        color = "brown";
    }
        void eat(){
            System.out.println("eats");
        }


        abstract void walk();    //give idea
}

class Horse extends Animals{
    void changeColor(){
        System.out.println("dark Brown");
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animals{
    void changeColor(){
        System.out.println("yellow");
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}