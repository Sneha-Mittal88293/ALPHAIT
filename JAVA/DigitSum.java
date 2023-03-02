import java.util.*;

class DigitSum{
    public static int Sum(int n){
        int sum =0;
        int result = 0;
        while(n>0){
        int rem = n%10;
         result = result + rem;
         n = n/10;
        }
        return result;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Sum(n));
    }
}