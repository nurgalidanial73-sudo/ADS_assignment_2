import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        Queue<String> billQueue = new LinkedList<>();

        billQueue.add("Electricity Bill");
        billQueue.add("Internet Bill");

        System.out.println("Queue: " + billQueue);

        System.out.println("Processing: " + billQueue.poll());

        System.out.println("Remaining: " + billQueue);
    }
}