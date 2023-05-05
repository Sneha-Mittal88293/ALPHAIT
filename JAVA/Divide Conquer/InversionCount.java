class InversionCount{
    public static int merge(int[] arr , int mid , int si , int ei){
        int i = si;
        int j = ei;
        int k = 0;
       int invCount = 0;
        int temp[] = new int[ei-si+1];

        while((i<mid) && (j<=ei)){
           if(arr[i] == arr[j]){
            temp[k] = arr[i];
            i++;
            k++;
           }
           else{
            temp[k] = arr[j];
           invCount += (mid-i);
            j++;
            k++;
           }
        }
        while(i<mid){
         temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<ei){
             temp[k] = arr[j];
            j++;
            k++;
        }
       for(i = si,k =0; i<=ei;i++,k++ ){
        arr[i] = temp[k];
       }
       return invCount;
    }
    public static int getInversions(int[] arr , int si , int ei){
        int invCount = 0;
          
          if(si<ei){
          int mid = (si+ei)/2;
          invCount = getInversions(arr,si,mid);
          invCount += getInversions(arr,mid+1,ei);
          invCount += merge(arr, mid+1 , si , ei);
          }
          return invCount;

    }
    public static void main(String args[]){
        int arr[]={1,20,6,4,5};
        System.out.print(getInversions(arr , 0 , arr.length-1));
    }
}