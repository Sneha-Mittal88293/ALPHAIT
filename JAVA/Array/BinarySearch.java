import java.util.*;

class BinarySearch{
    public static int search(int number[] , int key){
          int start=0;
          int end = number.length - 1;
          while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
               return mid;
            }
            else if(number[mid]> key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
          }
          return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] ={1,5,7,9,10,11,16};
        int key = 11;
        System.out.print(search(number , key));
        
    }
}