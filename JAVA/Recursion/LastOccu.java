class LastOccu{
    public static int lastOccu(int arr[], int key, int i){
        if(arr.length == i){
            return -1;
        }
        
        int isFound = lastOccu(arr , key , i+1);
        if(isFound == -1 && key == arr[i]){
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
        int arr[] ={2,4,5,7,5};
        System.out.print(lastOccu(arr,2,0));
    }
}