import java.util.*;

class ShortestPath{
    public static float distance(String str){
        int x =0;
        int y =0;
        for(int i =0; i<str.length() ; i++){
            if(str.charAt(i) == 'W'){
                x = x-1;
            }
            else if(str.charAt(i) == 'E'){
                x = x+1;
            }
            else if(str.charAt(i) == 'N'){
                y = y-1;
            }
            else {
                y = y+1;
            }
        }
        return (float)Math.sqrt(x*x + y*y);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String path = "WNEENESENNN";
       System.out.print(distance(path));
    }
}