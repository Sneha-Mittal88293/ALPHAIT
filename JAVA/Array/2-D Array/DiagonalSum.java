import java.util.*;

class DiagonalSum{
    public static void diagonalSum(int arr[][]){
        int sum  =0;
        // for(int i = 0 ; i<arr.length ; i++){
        //     for(int j = 0 ; j<arr[0].length ; j++){
        //         if(i == j){
        //             sum += arr[i][j];
        //              }
        //             else if(i+j == arr.length -1){
        //                 sum += arr[i][j];
        //             }
        //     }
        // }
        for(int i = 0 ; i<arr.length ; i++){
            //pd
            sum += arr[i][i];
            //sd
            if(i != arr.length-1-i){
            sum += arr[i][arr.length-1-i];
            }
        }
        
        System.out.print(sum);
    }
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
          diagonalSum(arr);  
      }
}