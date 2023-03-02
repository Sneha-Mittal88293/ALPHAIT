import java.util.*;

class Pairs{
    public static void make(int number[]){
        int tp=0;
       for(int i =0 ; i<number.length ; i++){
         for(int j = i+1 ; j<number.length ; j++){
            System.out.print("(" + number[i] + "," +number[j] +")");
            tp++;
         }
         System.out.println();
       }
       System.out.print(tp);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] = {1,3,2,4,6};
        make(number);
    }
}