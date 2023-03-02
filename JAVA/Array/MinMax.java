import java.util.*;

class MinMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int array[] = new int[size];

        for(int i = 0 ; i<size ; i++){
            array[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<size ; i++){
        if(array[i] < min){
          min = array[i];
        }
        if(array[i]> max){
            max = array[i];
        }
        }
       System.out.print(min);
       System.out.print(max);
    }
}