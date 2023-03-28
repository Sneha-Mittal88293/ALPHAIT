import java.util.*;

class ClearLastithBit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int bitmask = ((~0)<<2);
        System.out.print(n & bitmask);

        // ith time 1 = (~0)<<i ya fr (-1<<i)
    }
}
