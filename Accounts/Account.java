package Accounts;

public class Account {

    public static void main(String[] args) {
        AccountSystem account = new AccountSystem(0);
        account.credit(5000);
        account.debit(600);
        System.out.println(account.getBalance());
    }
}
