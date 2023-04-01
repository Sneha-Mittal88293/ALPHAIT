import java.util.*;

class HierarchialInheritance{
    public static void main(String args[]){
       Dogs d1 = new Dogs();
       d1.eats();
       Cats c1 = new Cats();
       c1.eats();
    }
}

class Animals{
  String color;

  void eats(){
     System.out.print("eats");
  }

  void breathe(){
       System.out.print("breathe");
  }
  }


class Dogs extends Animals{
   String breed;
   int legs;
}

class Cats extends Animals{
    String breed;
    int legs;
    
}