import java.util.*;

class SubArray{
    public static void printSubarray(int number[]){
         String variable ="";
         int ts = 0;
        for(int i = 0 ; i<number.length ; i++){
            System.out.println(number[i]);
            ts++;
            for(int j =i+1 ; j<number.length ; j++){
                 variable = variable+"" + number[j];
                 System.out.println(number[i] +"" +variable);
                 
                 ts++;
            }
            variable = "";
            System.out.println();
        }
        System.out.print(ts);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] = {1,3,5,7,9};
        printSubarray(number);
    }
}