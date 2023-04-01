import java.util.*;

class MethodOverloading{
    public static void main(String args[]){
       Calculator cal = new Calculator();
       System.out.println(cal.sum(2,3));
       System.out.println(cal.sum((float)2.5,(float)3.5));
       System.out.print(cal.sum(2,3,7));

    }
}

class Calculator{
    int sum(int a , int b){
        return a+b;
    }

    float sum(float a , float b){
        return a+b  ;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }
}