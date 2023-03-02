import java.util.*;

class SearchIndex2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int search = sc.nextInt();

        int [][] array = new int[rows][cols];

        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                if( search == array[i][j]){
                    System.out.print(i +" " + j);
                }
            }
        }
    }
}