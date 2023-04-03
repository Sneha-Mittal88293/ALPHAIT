import java.util.*;

class Factorial{
    public static int fact(int n){
        int fac = 1;
        if(n == 0){
            return 1;
        }
        fac = n * fact(n-1);
        return fac;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(fact(n));
    }
}