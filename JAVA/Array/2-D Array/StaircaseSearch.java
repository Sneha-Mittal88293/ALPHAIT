import java.util.*;

class StaircaseSearch{
    public static boolean topsearch(int arr[][], int key){
        int row = 0 ;
        int col = arr[0].length-1;
            
            while(row < arr.length && col >= 0){
                if(arr[row][col] == key){
                    System.out.print("\nfound at"+row + " , "+ col);
                    return true;
                }
                else if(arr[row][col] < key){
                    row++;
                }
                else{
                    col--;
                }
            }
            System.out.print("key not found");
            return false;
    }

    public static boolean bottomsearch(int arr[][] , int key){
        int row = arr.length-1;
        int col = 0;

        while(row >=0 && col < arr[0].length){
            if(arr[row][col] == key){
                System.out.print("\nkey found at index"+row+" , "+col);
                return true;
            }
            else if(arr[row][col]< key){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.print("key not found");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
        bottomsearch(arr , 40);
        topsearch(arr , 40);

    }
}