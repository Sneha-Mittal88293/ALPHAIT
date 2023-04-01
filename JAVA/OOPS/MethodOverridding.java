import java.util.*;

class MethodOverridding{
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.eat();
        Animals a1 = new Animals();
        a1.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}