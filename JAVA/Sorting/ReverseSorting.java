import java.util.*;

class ReverseSorting{
    public static void printArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void ReverseBubbleSort(int arr[]){
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = 0 ; j<arr.length-i-1 ; j++){
                 //swap
                 if(arr[j]< arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                 }
            }
        }
        printArray(arr);
    }


    public static void ReverseSelectionSort(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            int max = i;
            for(int j= i+1 ; j<arr.length ; j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
        }
        printArray(arr);
    }

    public static void ReverseInsertionSort(int arr[]){
        for(int i = 1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while( prev>=0 && arr[prev] < curr){
               arr[prev+1] = arr[prev];
               prev--;
            }
             arr[prev+1] = curr;
        }
        printArray(arr);
    }


    public static void ReverseCountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ;  i<arr.length ; i++){
           largest = Math.max(arr[i] , largest);
        }
        int []count = new int[largest+1];
        for(int i = 0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = count.length-1 ; i>=0 ; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printArray(arr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i = 0 ; i<arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            ReverseCountingSort(arr);
    }
}