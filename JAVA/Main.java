class PrintTable{
    void table(int num){
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(num + "* "+ i + "= " + num*i);
        }
    }
}

class A implements Runnable{
    public void run(){
      PrintTable p = new PrintTable();
      p.table(2);
    }
}

class B implements Runnable{
   public void run(){
      PrintTable p = new PrintTable();
      p.table(3);
    }
}

class Main{
    public static void main(String args[]){
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
    }
}
