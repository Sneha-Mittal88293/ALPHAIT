import java.util.*;

class Rotate{
    public int search(int nums[] , int target){
       int min = minSearch(nums);

    }
    public int minSearch(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid -1] > nums[mid]){
                return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;

    }
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int  number[] = {0,1,2,4,5,6,7};
 int target = 3 ;
 search(nums , target);
}

}

