import java.util.*;

class Basics{
    public static void Search(int arr[][]){
        int key = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j =0 ; j<arr[0].length ; j++){
                if(arr[i][j] < key){
                    key = arr[i][j];
                }
            }
        }
        System.out.print(key);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][2];

        for(int i = 0 ; i<3 ; i++){
            for(int j =0 ; j<2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<3 ; i++){
            for(int j =0 ; j<2 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Search(arr);

    }
}