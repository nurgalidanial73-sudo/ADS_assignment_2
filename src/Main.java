import java.util.*;

class BankAccount {
    int accountNumber;
    String username;
    double balance;

    public BankAccount(int accountNumber, String username, double balance) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;
    }

    public BankAccount(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }

    public BankAccount(String username) {
        this.username = username;
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList<BankAccount> accounts = new LinkedList<>();

        accounts.add(new BankAccount(1, "Ali", 150000));
        accounts.add(new BankAccount(2, "Sara", 220000));

        for (BankAccount acc : accounts) {
            System.out.println(acc.username + " – Balance: " + acc.balance);
        }
    }
}