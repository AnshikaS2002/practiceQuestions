package Accounts;

public class AccountSystem {
    int balance = 0;

    AccountSystem(int balance) {
        this.balance = balance;
    }

    void credit(int amount) {
        balance += amount;
    }

    void debit(int amount) {
        if (balance - amount >= 0)
            balance -= amount;
        else
            System.out.println("Not enough balance, cannot debit");
    }

    int getBalance() {
        return balance;
    }
}
