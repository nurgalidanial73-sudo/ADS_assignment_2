public class Task_6 {
    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new BankAccount("Ali", 150000);
        accounts[1] = new BankAccount("Sara", 220000);
        accounts[2] = new BankAccount("John", 100000);

        for (BankAccount acc : accounts) {
            System.out.println(acc.username + " – Balance: " + acc.balance);
        }
    }
}