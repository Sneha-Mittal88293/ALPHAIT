import java.util.*;

class FastExponentiation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int ans = 1;

        while(n >0){
            if( (n & 1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.print(ans);
    }
}