import java.util.*;
public class Part3 {
    static Scanner sc = new Scanner(System.in);
    static LinkedList<BankAccount> accounts = new LinkedList<>();
    static Stack<String> history = new Stack<>();
    static Queue<String> billQueue = new LinkedList<>();
    static Queue<BankAccount> requests = new LinkedList<>();
    static int accNum = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1 – Enter Bank\n2 – Enter ATM\n3 – Admin Area\n4 – Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bankMenu();
                    break;
                case 2:
                    atmMenu();
                    break;
                case 3:
                    adminMenu();
                    break;
                case 4:
                    return;
            }
        }
    }

    static void bankMenu() {
        System.out.println("\n1. Request Account\n2. Deposit\n3. Withdraw");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            System.out.print("Enter username: ");
            String name = sc.nextLine();
            requests.add(new BankAccount(accNum++, name, 0));
            System.out.println("Request added");
        }

        if (ch == 2) {
            System.out.print("Enter username: ");
            String name = sc.nextLine();
            for (BankAccount acc : accounts) {
                if (acc.username.equalsIgnoreCase(name)) {
                    System.out.print("Deposit: ");
                    double d = sc.nextDouble();
                    acc.balance += d;
                    history.push("Deposit " + d + " to " + name);
                    System.out.println("New balance: " + acc.balance);
                }
            }
        }

        if (ch == 3) {
            System.out.print("Enter username: ");
            String name = sc.nextLine();
            for (BankAccount acc : accounts) {
                if (acc.username.equalsIgnoreCase(name)) {
                    System.out.print("Withdraw: ");
                    double w = sc.nextDouble();
                    if (acc.balance >= w) {
                        acc.balance -= w;
                        history.push("Withdraw " + w + " from " + name);
                        System.out.println("New balance: " + acc.balance);
                    } else {
                        System.out.println("Not enough money");
                    }
                }
            }
        }
    }

    static void atmMenu() {
        System.out.print("Enter username: ");
        sc.nextLine();
        String name = sc.nextLine();

        for (BankAccount acc : accounts) {
            if (acc.username.equalsIgnoreCase(name)) {
                System.out.println("1. Balance\n2. Withdraw");
                int ch = sc.nextInt();

                if (ch == 1) {
                    System.out.println("Balance: " + acc.balance);
                }

                if (ch == 2) {
                    System.out.print("Withdraw: ");
                    double w = sc.nextDouble();
                    if (acc.balance >= w) {
                        acc.balance -= w;
                        System.out.println("Balance: " + acc.balance);
                    } else {
                        System.out.println("Not enough money");
                    }
                }
            }
        }
    }

    static void adminMenu() {
        System.out.println("\n1. Process Requests\n2. View Bills");
        int ch = sc.nextInt();

        if (ch == 1) {
            if (!requests.isEmpty()) {
                BankAccount acc = requests.poll();
                accounts.add(acc);
                System.out.println("Account created: " + acc.username);
            } else {
                System.out.println("No requests");
            }
        }

        if (ch == 2) {
            System.out.println("Bills: " + billQueue);
        }
    }
}