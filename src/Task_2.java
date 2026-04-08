import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<BankAccount> accounts = new LinkedList<>();

        accounts.add(new BankAccount("Ali", 150000));

        System.out.print("Enter username: ");
        String name = sc.next();

        for (BankAccount acc : accounts) {
            if (acc.username.equalsIgnoreCase(name)) {

                System.out.print("Deposit amount: ");
                double dep = sc.nextDouble();
                acc.balance += dep;

                System.out.println("New balance: " + acc.balance);

                System.out.print("Withdraw amount: ");
                double w = sc.nextDouble();

                if (acc.balance >= w) {
                    acc.balance -= w;
                    System.out.println("After withdraw: " + acc.balance);
                } else {
                    System.out.println("Not enough money!");
                }
            }
        }
    }
}