import java.util.*;

class BinaryToDecimal{

    public static void calculate(int n){
       int bin = 0;
       int pow = 0;
       while(n>0){
       int rem = n%2;
       bin = bin + (rem * (int)Math.pow(10 , pow));
       n = n/2;
       pow++;
       }
       System.out.print(bin);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculate(n);

    }
}