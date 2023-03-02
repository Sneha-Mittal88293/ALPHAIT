import java.util.*;

class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "racecr";
        for(int i =0 ; i<str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                 System.out.print("not a palindrome") ;
                 return;
            }
        }
       System.out.print("palindrome");
    }
}