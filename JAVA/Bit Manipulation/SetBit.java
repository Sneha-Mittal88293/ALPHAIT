import java.util.*;

class SetBit{
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        
       System.out.print(n | (1<<pos));
       
      }
}