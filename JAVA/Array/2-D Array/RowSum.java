import java.util.*;

class RowSum{
    public static void sum(int arr[][]){
        int sum = 0;
            for(int j = 0 ; j<arr[0].length ; j++){
                sum += arr[1][j];
                }
            
        System.out.print(sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] =  {{1,4,9},{11,4,3},{2,2,3}};
        sum(arr);
    }
}