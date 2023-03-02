import java.util.*;

class Selection{
    public static void selectionSort(int num[]){
        int n = num.length;
        for(int i = 0 ; i<n-1 ; i++){
            int min = i;
            for(int j = i+1; j<n ; j++){
                if(num[min]>num[j]){
                    min= j;
                }
            }
            int temp  = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String args[]){
        int num[] = {5,4,1,3,2};
        selectionSort(num);
    }
}