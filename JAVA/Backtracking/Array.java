class Array{
    public static void traverse(int arr[], int idx , int val){
        if(idx == arr.length){
            printarr(arr);
            return;
        }
        arr[idx] = val;
        traverse(arr,idx+1,val+1);
        arr[idx] = arr[idx] -2;
        
    }
    public static void printarr(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5] ;
        
        traverse(arr , 0 , 1);
        printarr(arr);
    }
}