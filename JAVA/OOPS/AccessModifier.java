import java.util.*;

public class Accessmodifier{
    public static void main(String args[]){
        BankAccount bk = new BankAccount();
        bk.setPassword("abcdef");
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}