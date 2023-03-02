import java.util.*;

class MatrixTranspose{
    public static void findTranspose(int arr[][]){
        int matrix[][] = new int[3][2];
        for(int i =0 ; i<arr.length ; i++){
            for(int j = 0 ; j <arr[0].length ; j++){
                 matrix[j][i] = arr[i][j];
            }
        }
        for(int i =0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{2 ,3 ,4},
                       {5, 6, 7}};
               findTranspose(arr);        
    }
}