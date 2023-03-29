import java.util.*;

class LowerCase{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        for(char ch = 'A' ; ch<='Z' ; ch++){
            System.out.print((char) (ch | ' '));
        }
    }
}