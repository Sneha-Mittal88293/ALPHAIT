import java.util.*;

public class ClassAndObjects{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.print(p1.color +","+ p1.tip);
        p1.color = "yellow";
        System.out.print(p1.color +","+ p1.tip);


    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip =  newTip;
    }
}
