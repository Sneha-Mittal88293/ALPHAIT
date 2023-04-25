class FindLength{
    public static void printLength(String str, int i){
        if(str.length() == i){
            System.out.print(i);
            return;
        }
         
        printLength(str , i+1);


    }
    public static void main(String args[]){
        String str = "Sneha Mittal";
        printLength(str,0);
    }
}