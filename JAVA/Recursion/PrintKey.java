import java.util.*;

class PrintKey{
    public static void printkey(int arr[] , int key , int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i);
            
        }
        printkey(arr,key,i+1);
    }
    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        printkey(arr, key,0);
    }
}