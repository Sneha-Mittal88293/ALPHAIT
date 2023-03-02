import java.util.*;

class MaxSumArray{
    public static void printSubarray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
   
       prefix[0] = number[0];

        for(int i = 1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + number[i];
        }
                
                for(int i = 0 ; i<number.length ; i++){
                    int start = i;
                    for (int j = i ; j<number.length ; j++){
                        int end = j;

                        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                         if(currSum > maxSum){
                         maxSum = currSum;
                   
                    }
                }
            }
                 System.out.print("Max sum is " + maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] = {1,3,14,7,8};
        printSubarray(number);
    }
}