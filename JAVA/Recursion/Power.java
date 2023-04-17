class Power{
    public static int pow(int x , int n){
        if(n == 0){
            return 1;
        }
        return x * pow(x ,n-1);
    }

    public static int pow2(int x , int n){
        if( n == 0){
        return 1;
         }
        if( n  % 2 == 0){
            return pow(x , (n/2)) * pow(x , (n/2));
        }
      
      return x * pow(x , (n/2)) * pow(x , (n/2));
    }
    public static void main(String args[]){
        int x = 2;
        int n = 9;
        System.out.println(pow(x ,n));
        System.out.print(pow2(x,n));
    }
}