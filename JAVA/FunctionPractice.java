import java.util.*;

class FunctionPractice{
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean checkPalindrome(int n){
        
        int original = n ;
        int reverse = 0;
        int  pow = 0;
        while(n != 0){
        int rem = n%10;
        reverse = rem  + reverse*10;
        n=n/10;
        }
        if(reverse == original){
            return true;
        }
        return false;
    }
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    // System.out.print(isEven(n));
    System.out.print(checkPalindrome(n));
   }
}