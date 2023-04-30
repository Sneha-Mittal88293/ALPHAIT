class TowerOfHanoi{
    public static void func(int n , String src, String helper , String dest){
        if(n ==1){
            System.out.println("transfer"+ n +"disk from "+src+"to"+dest );
            return;
        }
        func(n-1 ,src, dest,helper);
          System.out.println("transfer"+ n +"disk from "+src+"to"+helper );
          func(n-1 ,helper,src,dest);

    }
        public static void main(String args[]){
            int n = 4;
            func(n,"A","B","C");
        }
    }
