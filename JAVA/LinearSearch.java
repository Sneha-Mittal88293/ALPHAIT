import java.util.*;
class LinearSearch{

    public static int linear(int marks[] , int k , int n){
       
        
        for(int i = 0 ; i<=marks.length ; i++){
            if(marks[i] == k)
            return i;
        }
        return -1;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int k = 10;
    int n = sc.nextInt();
    int marks[] = {5 , 10 , 15 , 20};

    int index = linear(marks , k , n);
    System.out.print(index);
}
}