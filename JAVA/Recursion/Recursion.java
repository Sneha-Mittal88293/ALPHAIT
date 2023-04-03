import java.util.*;

class Recursion{
    public static void decfunc(int n){
        if(n==0){
             System.out.println(n);
             return;
        }

            System.out.print(n+" ");
            decfunc(n-1);
    }
    public static void incfunc(int n){
        if(n == 0){
            System.out.print(n + " ");
            return;
        }
        incfunc(n-1);
        System.out.print(n+" ");

    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         decfunc(n);
         incfunc(n);

    }
}

