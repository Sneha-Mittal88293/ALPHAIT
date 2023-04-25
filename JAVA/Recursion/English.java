class English{
     
    static String digits[] = {"zero" , "one" , "two" , "three", "four","five","six","seven","eight","nine"};
    public static void printNumber(int num){
        if(num == 0){
            return;
        }

        int lastDigit = num %10;
        printNumber(num/10);
        System.out.print(digits[lastDigit]);
    }
    public static void main(String args[]){
       printNumber(1453); 
       System.out.println();
    }
}