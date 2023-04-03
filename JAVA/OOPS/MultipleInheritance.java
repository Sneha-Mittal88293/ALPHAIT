class MultipleInheritance{
    public static void main(String args[]){
        Bear b= new Bear();
        b.veg();
        b.nonveg();
    }
}

interface Herbivore{
    void veg();
}

interface Carnivore{
        void nonveg();
}

class Bear implements Herbivore , Carnivore{
    public void veg(){
        System.out.print("eats veg food");
    }

    public void nonveg(){
        System.out.print("eats non veg food");
    }
}