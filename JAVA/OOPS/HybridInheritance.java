import java.util.*;

class HybridInheritance{
    public static void main(String args[]){
           Peacock p1 = new Peacock();
           p1.name();
           p1.eat();
    }
}

class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.print("breathe");
    }
}

class Fish extends Animals{
     int fins;

     void swim(){
        System.out.print("Swim");
    }
}

class Bird extends Animals{

     void fly(){
        System.out.print("fly");
    }
}

class Mammals extends Animals{
     
     void walk(){
        System.out.print("Walk");
    }
}

class Tuna extends Fish{
    void name(){
        System.out.print("Tuna");
    }
}

class Shark extends Fish{
    void name(){
        System.out.print("Shark");
    }
}

class Peacock extends Bird{
    void name(){
        System.out.println("Peacock");
    }
}

class Dogs extends Mammals{
    void name(){
        System.out.print("Dogs");
    }
}

class Cats extends Mammals{
    void name(){
        System.out.print("Cats");
    }
}

class Humans extends Mammals{
    void name(){
        System.out.print("Humans");
    }
}

