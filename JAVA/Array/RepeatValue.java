import java.util.*;

class RepeatValue{
    public static boolean check(int nums[]){
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                     return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,2,3};
        System.out.print(check(nums));
    }
}