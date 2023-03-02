import java.util.*;

class Kadanes{
    public static void kadane(int number[]){
        int max = Integer.MIN_VALUE;
        int curr = 0 ;

        for(int i = 0  ; i<number.length ; i++){
            curr = curr + number[i];

            if(curr < 0){
                curr = 0;
            }
            max = Math.max(curr , max);
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] = {-2, -3 ,4 , -1 , -2 , 1 , 5 , -3};

        kadane(number);
    }
}