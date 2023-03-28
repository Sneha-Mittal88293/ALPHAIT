import java.util.*;

class PowerOfTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bitmask = n-1;
        if((n & bitmask) == 0){
            System.out.print(n + " is power of 2");
        } 
        else{
            System.out.print(n + " is not a power of 2");
        }
    }
}