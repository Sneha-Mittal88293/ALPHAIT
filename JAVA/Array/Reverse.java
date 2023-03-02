import java.util.*;
class Reverse{
    public static void reverse(int number[]){
        int k =number.length-1;
        int i = 0;
        while(i<k){
        int temp = number[i];
        number[i] = number[k];
        number[k] = temp; 
        i++;
        k--; 
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number[] = {3,6,1,3,2,9};
     reverse(number);
     for(int i = 0 ; i<number.length ; i++){
        System.out.print(number[i]+" ");
     }
   }
}