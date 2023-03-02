import java.util.*;

class SearchIndex{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();

        int[] number  = new int[size];

        for(int i = 0 ; i<size ; i++){
            number[i] = sc.nextInt();
        }

        for(int i = 0 ; i<size ; i++){
            if(n == number[i]){
                System.out.print(i);
            }
        }
    }
}