class MergeSort{

    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void mergeSort(int arr[] , int si, int ei){
        if(si >= ei){
            return;
        }
           int mid = si +(ei-si)/2;
           mergeSort(arr,si,mid);
           mergeSort(arr,mid+1,ei);
           merge(arr , si , mid , ei);
    }
    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei-si+1];

        int i = si;  //iterator for left part
        int j = mid+1;  //iterator for left part
        int k = 0;  //iterator for temp
        
        while( i <= mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                //k++;
                i++;
            }
            else{
                 temp[k] = arr[j];
                   //k++;
                   j++;
            }
              k++;
        }
       //leftover element of left part
        while( i <= mid){
            temp[k++] = arr[i++];
        }
       //leftover element of right part
        while(j <= ei){
          temp[k++] = arr[j++];
        }


       //copy the element of temp arr to original arr
        for(k = 0 , i=si; k<temp.length ; k++, i++){
             arr[i]= temp[k];
        }

      
    }
    public static void main(String args[]){
         int arr[] = {1,4,3,7,6,2,1};
         mergeSort(arr,0,arr.length-1);
         printArr(arr);
    }
}