import java.util.*;

class UpdateBit{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n ^ (1 << 2));
    }
}