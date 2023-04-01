import java.util.*;

class ConstructorHierarchy{
    public static void main(String args[]){
       Mustang m = new Mustang();
       //animal -> horse  -> mustang
    }
}

class Animals{
    Animals(){
        System.out.println("ANIMALS");
    }
}

class Horse extends Animals{
    Horse(){
        System.out.println("HORSE");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("MUSTANG");

    }
}
