import java.util.*;

class Fibonacci{
    static int a = 0 ,b = 1 , c=0;
    public static void fibo(int n){
        if(n>0){
            c = a+b;
            a =b;
            b = c;
            System.out.print(c+" ");
            fibo(n-1);

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibo(n-2);

    }
}

