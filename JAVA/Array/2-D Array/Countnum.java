import java.util.*;
class Countnum{
    public static void Count(int arr[][],int key){
        int count = 0;
        for(int i =0 ; i< arr.length ; i++){
            for(int j =0 ; j<arr[0].length ;j++){
                if(arr[i][j] == key){
                    count++;
                }
            }
        }
        System.out.print(count);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{4,7,8},
                        {8,8,7}};
          Count(arr , 8);

    }
}