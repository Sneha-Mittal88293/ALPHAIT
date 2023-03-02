import java.util.*;

class Order{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int array[] = new int[size];
        for(int i =0 ; i<size ; i++){
            array[i] = sc.nextInt();
        }
        boolean isOrder = true;
        for(int i = 0 ; i<size-1 ; i++){
            if(array[i]>array[i+1]){
               isOrder = false;
            }
        }
        if(isOrder){
            System.out.print("right");
        }
        else{
            System.out.print("wrong");
        }
    }
}