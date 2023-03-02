import java.util.*;

class Transpose{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] matrix = new int[m][n];

        for(int i= 0 ; i<m ; i++){
            for( int j =0 ; j< n ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i= 0 ; i<m ; i++){
            for(int j =0 ; j< n ; j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
}