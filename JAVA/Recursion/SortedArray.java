class SortedArray{
    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        else if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String args[]){
          int arr[] = {1,2,3,4,7,9};
          System.out.print(isSorted(arr,0));
    }
}