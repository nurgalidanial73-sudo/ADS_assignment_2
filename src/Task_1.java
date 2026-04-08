import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<BankAccount> accounts = new LinkedList<>();

        accounts.add(new BankAccount(1, "Ali", 150000));
        accounts.add(new BankAccount(2, "Sara", 220000));

        System.out.println("Accounts List:");
        for (BankAccount acc : accounts) {
            System.out.println(acc.username + " – Balance: " + acc.balance);
        }

        System.out.print("Enter username to search: ");
        String name = sc.next();

        for (BankAccount acc : accounts) {
            if (acc.username.equalsIgnoreCase(name)) {
                System.out.println("Found: " + acc.username + " Balance: " + acc.balance);
            }
        }
    }
}