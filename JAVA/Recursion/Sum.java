import java.util.*;

class Sum{
    public static int calcSum(int n){
        int add = 0;
        if(n == 0){
            return 0;
        }
        add = n + calcSum(n-1);
        return add;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(calcSum(n));
    }
}