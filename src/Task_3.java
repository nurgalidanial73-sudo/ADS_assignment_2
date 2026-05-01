public class Task_3 {

    static class MyStack {

        private String[] arr;

        private int capacity;

        private int top;

        public MyStack(int cap) {
            capacity = cap;
            arr = new String[capacity];
            top = -1;
        }

        void push(String x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        String pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return null;
            }
            return arr[top--];
        }

        String peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return null;
            }
            return arr[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        MyStack history = new MyStack(10);

        history.push("Deposit 50000 to Ali");
        history.push("Withdraw 20000 from Ali");

        System.out.println("Last transaction: " + history.peek());
        System.out.println("Undo: " + history.pop());
        System.out.println("Now last: " + history.peek());
    }
}