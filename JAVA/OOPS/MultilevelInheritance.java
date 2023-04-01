import java.util.*;

class MultilevelInheritance{
    public static void main(String args[]){
         Dogs d1 = new Dogs();
         d1.eat();
         d1.legs = 4;
         System.out.println(d1.legs);
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
//single level inheritance
class Mammals extends Animals{
    int legs;
}

//multi level inheritance

class Dogs extends Mammals{
    String breed;
}