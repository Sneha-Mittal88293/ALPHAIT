import java.util.*;

class Bubble{
    public static void bubbleSort(int num[]){
        int n = num.length;
        for(int i = 0 ; i<n-1 ; i++){   //for turn
            for(int j =0 ;j<n-1-i ; j++){     //for compare
                if(num[j] > num[j+1]){       
                    int temp = num[j+1];
                    num[j+1] = num[j] ;
                    num[j] = temp;
                }
            }
        }
        for(int i = 0 ; i<n ; i++){
          System.out.print(num[i]);
        }
        
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int num[] = {5,4,1,3,2};
            bubbleSort(num);
        }
}