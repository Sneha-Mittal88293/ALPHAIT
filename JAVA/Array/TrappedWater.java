import java.util.*;

class TrappedWater{
    public static int trapped(int height[]){
        int n = height.length;
        //leftmax array
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i = 1 ; i<n ; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }
        //RightMax array
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ; i--){
           RightMax[i] = Math.max(height[i] , RightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0 ; i<n ; i++){
            int waterLevel = Math.min(LeftMax[i] , RightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height[] = {4 , 2 , 0 , 6 , 3 ,2 ,5};
        System.out.print(trapped(height));
    }
}