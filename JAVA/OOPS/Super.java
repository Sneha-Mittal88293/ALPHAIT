class Super{
    public static void main(String args[]){
         Horse h = new Horse();
         System.out.print(h.color);
    }
}

class Animal{

    String color;
    Animal(){
    System.out.print("animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        color = "brown";      //here we use super  like that super.color
        System.out.print("Horse constructor called");
    }
}