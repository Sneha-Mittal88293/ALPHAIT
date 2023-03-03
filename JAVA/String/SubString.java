import java.util.*;

class SubString{
    public static String substr(String str){
        String s = "";
        for(int i = 1; i<3 ; i++){
             s += str.charAt(i);
        }
        // System.out.print(s);
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "snehamittal";
        String substring = str.substring (1,3);
        System.out.print(substring);
        System.out.print(substr(str));
    }
}