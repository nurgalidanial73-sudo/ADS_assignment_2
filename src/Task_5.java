import java.util.*;

public class Task_5 {
    public static void main(String[] args) {
        Queue<BankAccount> requests = new LinkedList<>();
        LinkedList<BankAccount> accounts = new LinkedList<>();

        requests.add(new BankAccount("Ali"));
        requests.add(new BankAccount("Sara"));

        System.out.println("Pending requests:");
        for (BankAccount acc : requests) {
            System.out.println(acc.username);
        }

        BankAccount newAcc = requests.poll();
        accounts.add(newAcc);

        System.out.println("Processed: " + newAcc.username);

        System.out.println("Accounts:");
        for (BankAccount acc : accounts) {
            System.out.println(acc.username);
        }
    }
}