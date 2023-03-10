import java.util.*;

class Insertion{
    public static void insertionSort(int num[]){
        int n = num.length;
        for(int i = 1 ; i<n ; i++){
            int curr = num[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev>0 && num[prev] > curr ){
                num[prev+1] = num[prev];
                prev--;
            }
            //insert the element
            num[prev+1] = curr;
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String args[]){
        int num[] = {1 ,5 ,3, 4, 2};
        insertionSort(num);
    }
}