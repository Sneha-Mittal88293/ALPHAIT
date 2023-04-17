class Tiling{
    public static int arrange(int n){   //2*n floor size
        if( n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int verticalchoice = arrange(n-1);

        //horizontal choice
        int horizontalchoice = arrange(n-2);

        int totalways = verticalchoice + horizontalchoice;
        return totalways;

    }
    public static void main(String args[]){
        System.out.print(arrange(4));

    }
}