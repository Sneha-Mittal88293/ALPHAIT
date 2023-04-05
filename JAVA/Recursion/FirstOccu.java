class FirstOccu{
    public static int firstOccurence(int arr[] , int key, int i){
         if(arr.length == i){
            return -1;
         }
         if(key == arr[i]){
            return i;
         }
         return firstOccurence(arr , key , i+1);
           
       
   }
    public static void main(String args[]){
        int arr[] = {4,6,8,9.2};
        System.out.print(firstOccurence(arr,2,0));
    }
}