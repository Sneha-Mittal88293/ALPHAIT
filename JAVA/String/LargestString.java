import java.util.*;

class LargestString{
    public static String FindLargest(String str[]){
        String largest = str[0];
             for(int i=0 ; i<str.length ; i++){
                if(largest.compareTo(str[i])<0){
                      largest = str[i];
                }
             }
             return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            String str[] = {"apple" , "mango" , "banana"};
          System.out.print(FindLargest(str));  
    }
}