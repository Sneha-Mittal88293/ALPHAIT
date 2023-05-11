class FindSubset{
    public static void subset(String str, String ans, int i){
         if(i == str.length()){
            System.out.print(ans+" ");
            return;
         }
        //yes
        subset(str,ans+str.charAt(i),i+1);

        //no
        subset(str,ans,i+1);

    }
    public static void main(String args[]){

        // subset of a string of length n = 2^n;
        String str = "abc";
        subset(str,"",0);
    }
}