import java.util.*;

class Recursion{
    public static void func(int n){
        if(n==0){
             System.out.print(n);
             return;
        }

            System.out.print(n+" ");
            func(n-1);
            }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         func(n);
    }
}

