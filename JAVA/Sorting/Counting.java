import java.util.*;

class Counting{
    public static void countingSort(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<num.length ; i++){
            largest= Math.max(num[i] , largest);
        }

         int count[] = new int[largest+1];
        for(int i =0 ; i<num.length ; i++){
            count[num[i]]++;
        }

        //sorting
        int j =0;
        for(int i =0 ; i<count.length ; i++){
            while(count[i]>0){
                num[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int i =0 ; i<num.length ; i++){
            System.out.print(num[i]);
        }



    }
    public static void main(String args[]){
        int num[] = {1,4,1,3,2,4,3,7};
        countingSort(num);
    }
}