import java.util.*;

class LinearSearch{
    public static int Search(int marks[] , int largest){
        for(int i = 0 ; i<marks.length ; i++){
            if(marks[i]>largest){
                largest = marks[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int largest = -1;
        int marks[] = {1,20,30,5,2};
        System.out.print(Search(marks , largest));
    }
}