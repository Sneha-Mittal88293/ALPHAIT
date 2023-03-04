import java.util.*;

class Anagrams{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = "Heart";
        String str2 = "Earth";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            //convert string into char array
             char[]  str1charArray = str1.toCharArray();
             char[]  str2charArray = str2.toCharArray();

             //sort the chararray
             Arrays.sort(str1charArray);
             Arrays.sort(str2charArray);
            
            Boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.print(str1 + " is anagrams to " + str2);
            }
            else{
                System.out.print(str1 + " is not anagrams to " + str2);
            }
        }
        else{
            System.out.print(str1 + " is not eual in length to " + str2);
        }

    }
}