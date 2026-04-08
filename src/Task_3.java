import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        history.push("Deposit 50000 to Ali");
        history.push("Withdraw 20000 from Ali");

        System.out.println("Last transaction: " + history.peek());

        System.out.println("Undo: " + history.pop());

        System.out.println("Now last: " + history.peek());
    }
}