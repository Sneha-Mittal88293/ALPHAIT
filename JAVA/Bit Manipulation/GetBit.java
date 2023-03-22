import java.util.*;

class GetBit{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        int bitMask = 1<<pos;

        if((n & bitMask) == 0){
            System.out.print("number is 0");
        }
        else{
            System.out.print("number is 1");
        }
    }
}