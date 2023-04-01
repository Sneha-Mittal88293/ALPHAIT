import java.util.*;

class Inheritance{
public static void main(String args[]){
    Fish f1 = new Fish();
    f1.eat();
}
}

//Base class

class Animal{
    String color;

    void eat(){
        System.out.print("eats");
    }

    void  breathe(){
        System.out.print("breathe");
    }
}

//Derived class

class Fish extends Animal{
 
 int fins;

void swim(){
        System.out.print("Swim");
    }
}