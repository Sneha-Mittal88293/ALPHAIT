import java.util.*;

class Concatenation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String second = "abcd";
        System.out.println(second.length()); //find the length of the string
        System.out.println(name+second); //concatenation
        System.out.println(second.charAt(2));           //find the character at any index

    }
}