import java.util.*;

class MaxSum{
    public static void printSubarray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        int ts = 0;
        for(int i = 0 ; i<number.length ; i++){
            for(int j =i+1 ; j<number.length ; j++){
                currSum  = 0;
                for(int k = i ; k<= j ; k++){
                    currSum += number[k];
                }
                System.out.println(currSum+" ");
                if(currSum > maxSum){
                    maxSum = currSum;
                }    
            }
        }
        System.out.print("Max sum is " + maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] = {1,3,5,7,9};
        printSubarray(number);
    }
}