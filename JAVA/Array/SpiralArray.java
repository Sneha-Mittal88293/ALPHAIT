import java.util.*;

class SpiralArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][]matrix  = new int [m][n];

        for(int i =0 ; i<m ; i++){
            for (int j =0 ; j<n ;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i =0 ; i<m ; i++){
            for (int j =0 ; j<n ;j++){
                System.out.print(matrix[i][j] + "  ");
            }
              System.out.println();
        }


        int rowStart = 0;
        int rowEnd = m-1;
        int colStart = 0 ;
        int colEnd = n-1 ;

        while(colStart<=colEnd && rowStart<=rowEnd){

            for(int col = colStart ; col<=colEnd ; col++){
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            for(int row = rowStart ; row<=rowEnd ; row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;


            for(int col = colEnd ; col>=colStart ; col--){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;

            for(int row = rowEnd ; row >= rowStart ; row--){
                System.out.print(matrix[row][colStart]+" ");
            }

            colStart++;
        }
        
    }
}